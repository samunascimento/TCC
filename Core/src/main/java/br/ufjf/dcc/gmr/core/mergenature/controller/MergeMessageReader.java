package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.mergenature.model.Conflict;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictType;
import java.io.File;

/**
 * Class to interpret the message of the merge to catch conflict
 *
 * @author João Pedro Lima
 * @since 09-11-2020
 */
public class MergeMessageReader {

    public static Conflict getConflictFromMessage(String message) {
        if (message.contains("(content)")) {
            return contentType(message);
        } else if (message.contains("(add/add)")) {
            return coincidenceAddingType(message);
        } else if (message.contains("(rename/rename)")) {
            return doubleRenameType(message);
        } else if (message.contains("(modify/delete)")) {
            return modifyDeleteType(message);
        } else if (message.contains("(rename/delete)")) {
            return renameDeleteType(message);
        } else if (message.contains("(rename/add)")) {
            return renameAddType(message);
        } else if (message.contains("(file location)")) {
            return fileLocationType(message);
        } else if (message.contains("(submodule)")) {
            return submoduleType(message);
        } else {
            System.out.println("NOVA MESSAGEM OBTIDA:\n" + message + "\n");
            return null;
        }
    }

    //CONFLICT (content): Merge conflict in src/java/voldemort/rest/coordinator/admin/CoordinatorAdminRequestHandler.java
    private static Conflict contentType(String message) {
        Conflict result = new Conflict();
        String[] auxStringArray = message.split("in ");
        result.setParent1FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setParent2FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setAncestorFilePath(auxStringArray[auxStringArray.length - 1]);
        result.setConflictType(ConflictType.CONTENT);
        return result;
    }

    //CONFLICT (add/add): Merge conflict in src/java/voldemort/client/protocol/admin/AdminClientConfig.java
    private static Conflict coincidenceAddingType(String message) {
        Conflict result = new Conflict();
        String[] auxStringArray = message.split("in ");
        result.setParent1FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setParent2FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setAncestorFilePath("Absent");
        result.setConflictType(ConflictType.COINCIDENCE_ADDING);
        return result;
    }

    /*
    
    CONFLICT (rename/rename): Rename directory test/unit/voldemort/store/filesystem->test/unit/voldemort/store/textfile in 
    HEAD. Rename directory test/unit/voldemort/store/filesystem->test/unit/voldemort/store/configuration in 
    f4122146d4c2903041c2474ee09efe21087b8be9
    
    CONFLICT (rename/rename): Rename "test/unit/voldemort/store/filesystem/FilesystemStorageEngineTest.java"->"test/unit/voldemort/store/textfile/TextFileStorageEngineTest.java" 
    in branch "HEAD" rename "test/unit/voldemort/store/filesystem/FilesystemStorageEngineTest.java"->"test/unit/voldemort/store/configuration/ConfigurationStorageEngineTest.java" 
    in "f4122146d4c2903041c2474ee09efe21087b8be9"
    
     */
    private static Conflict doubleRenameType(String message) {
        Conflict result = new Conflict();
        String[] auxStringArray = message.split(": ");
        String auxString;
        if (auxStringArray[auxStringArray.length - 1].contains("Rename directory")) {
            auxString = auxStringArray[auxStringArray.length - 1].replaceAll("Rename directory ", "");
            result.setConflictType(ConflictType.DIRECTORY_RENAME);
        } else {
            auxString = auxStringArray[auxStringArray.length - 1].replaceAll("Rename ", "").replaceAll("\"", "").replaceAll(" rename ", ". ").replaceAll("branch ", "");
            result.setConflictType(ConflictType.FILE_RENAME);
        }
        auxStringArray = auxString.split("\\. ");
        result.setAncestorFilePath(auxStringArray[0].split("->")[0]);
        auxString = auxStringArray[0].split("->")[1];
        if (auxString.contains(" in HEAD")) {
            result.setParent1FilePath(auxString.replaceAll(" in HEAD", ""));
            result.setParent2FilePath(auxStringArray[1].split("->")[1].split(" in")[0]);
        } else {
            result.setParent2FilePath(auxString.split(" in")[0]);
            result.setParent1FilePath(auxStringArray[1].split("->")[1].split(" in")[0]);
        }
        return result;
    }

    /*
    
    CONFLICT (modify/delete): src/java/voldemort/client/protocol/admin/ProtoBuffAdminClientRequestFormat.java deleted in 
    f1e5ec710bdd4d2df684932e6fe602133426c98f and modified in HEAD. 
    Version HEAD of src/java/voldemort/client/protocol/admin/ProtoBuffAdminClientRequestFormat.java left in tree.
    
    CONFLICT (modify/delete): src/java/voldemort/store/filesystem/FilesystemStorageEngine.java deleted in 
    HEAD and modified in b2daa523a27ec0e977cc1e9ee81e971909852ba0. 
    Version b2daa523a27ec0e977cc1e9ee81e971909852ba0 of src/java/voldemort/store/filesystem/FilesystemStorageEngine.java left in tree.
    
     */
    private static Conflict modifyDeleteType(String message) {
        Conflict result = new Conflict();
        String[] auxStringArray = message.split(": ");
        auxStringArray = auxStringArray[auxStringArray.length - 1].split(" deleted in ");
        if (auxStringArray[auxStringArray.length - 1].startsWith("HEAD")) {
            result.setParent1FilePath("Absent");
            result.setParent2FilePath(auxStringArray[0]);
        } else {
            result.setParent1FilePath(auxStringArray[0]);
            result.setParent2FilePath("Absent");
        }
        result.setAncestorFilePath(auxStringArray[0]);
        result.setConflictType(ConflictType.MODIFY_DELETE);
        return result;
    }

    /*
    
    CONFLICT (rename/delete): runtime/Go/src/antlr4/TraceListener.go deleted in HEAD and renamed to 
    runtime/Go/src/antlr/TraceListener.go in 31d21ff4db8ddcf76bae1b865cd568621bfd5b4d. Version 
    31d21ff4db8ddcf76bae1b865cd568621bfd5b4d of runtime/Go/src/antlr/TraceListener.go left in tree.
    
    CONFLICT (rename/delete): src/java/voldemort/store/filesystem/package.html deleted in 
    f4122146d4c2903041c2474ee09efe21087b8be9 and renamed to src/java/voldemort/store/textfile/package.html 
    in HEAD. Version HEAD of src/java/voldemort/store/textfile/package.html left in tree.
    
     */
    private static Conflict renameDeleteType(String message) {
        Conflict result = new Conflict();
        String[] auxStringArray = message.split(": ")[1].split("\\. ");
        String auxString = auxStringArray[0];
        auxStringArray = auxString.split(" and renamed to ")[0].split(" deleted in ");
        if (auxStringArray[1] == "HEAD") {
            result.setAncestorFilePath(auxStringArray[0]);
            result.setParent1FilePath("Absent");
            auxStringArray = auxString.split(" and renamed to ")[0].split(" in ");
            result.setParent2FilePath(auxStringArray[0]);
        } else {
            result.setAncestorFilePath(auxStringArray[0]);
            result.setParent2FilePath("Absent");
            auxStringArray = auxString.split(" and renamed to ")[0].split(" in ");
            result.setParent1FilePath(auxStringArray[0]);
        }
        result.setConflictType(ConflictType.RENAME_DELETE);
        return result;
    }

    /*
    
    CONFLICT (rename/add): Rename 
    tool/src/org/antlr/v4/codegen/model/LL1StarBlock.java->runtime/Cpp/runtime/atn/PrecedencePredicateTransition.cpp 
    in 014d9fd59397ab6434ce29447ef8d27e558a38e5.  Added runtime/Cpp/runtime/atn/PrecedencePredicateTransition.cpp in HEAD
    
     */
    private static Conflict renameAddType(String message) {
        Conflict result = new Conflict();
        String[] auxStringArray = message.split(": Rename")[1].split("\\. ");
        String auxString = auxStringArray[0];
        auxStringArray = auxString.split("->");
        result.setAncestorFilePath(auxStringArray[0]);
        if (auxStringArray[1].contains("in HEAD")) {
            result.setConflictType(ConflictType.P1_RENAMED_P2_ADD);
        } else {
            result.setConflictType(ConflictType.P2_RENAMED_P1_ADD);
        }
        auxString = auxStringArray[1].split(" in ")[0];
        result.setParent1FilePath(auxString);
        result.setParent2FilePath(auxString);
        return result;
    }

    /*
    
    CONFLICT (file location): folder/file2.txt added in HEAD inside a directory that was renamed in branch1, 
    folderRenamed/file2.txt.
    
     */
    private static Conflict fileLocationType(String message) {
        Conflict result = new Conflict();
        result.setConflictType(ConflictType.FILE_LOCATION);
        message = message + " ";
        String[] auxStringArray = message.split("(file location): ");
        String auxString = auxStringArray[1].replaceAll(" added in ", " ").replaceAll(" inside a directory that was renamed in ", " ").replaceAll(", suggesting it should perhaps be moved to ", " ").replaceAll("\\. ", "");
        auxStringArray = auxString.split(" ");
        auxString = auxStringArray[0].split(File.separator)[auxStringArray[0].split(File.separator).length - 1];
        result.setAncestorFilePath(auxStringArray[0].replace(auxString, ""));
        if (auxStringArray[1] == "HEAD") {
            result.setParent1FilePath(auxStringArray[0]);
            result.setParent2FilePath(auxStringArray[3]);
        } else {
            result.setParent1FilePath(auxStringArray[3]);
            result.setParent2FilePath(auxStringArray[0]);
        }
        return result;
    }

    /*
    
    CONFLICT (submodule): Merge conflict in reference/antlr4
    
     */
    private static Conflict submoduleType(String message) {
        Conflict result = new Conflict();
        String[] auxStringArray = message.split("in ");
        result.setParent1FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setParent2FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setAncestorFilePath("Absent");
        result.setConflictType(ConflictType.SUBMODULE);
        return result;
    }

}
