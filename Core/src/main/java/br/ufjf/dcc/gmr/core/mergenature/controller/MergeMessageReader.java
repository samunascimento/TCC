package br.ufjf.dcc.gmr.core.mergenature.controller;

import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFileType;

/**
 * Class to interpret the message of the merge to catch conflict
 *
 * @author João Pedro Lima
 * @since 09-11-2020
 */
public class MergeMessageReader {

    public static ConflictFile getConflictFileFromMessage(String message) {
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
        } else if (message.contains("(directory rename split)")) {
            return directoryRenameSplitType(message);
        } else {
            System.out.println("NOVA MESSAGEM OBTIDA:\n" + message + "\n");
            return null;
        }
    }

    //CONFLICT (content): Merge conflict in src/java/voldemort/rest/coordinator/admin/CoordinatorAdminRequestHandler.java
    private static ConflictFile contentType(String message) {
        ConflictFile result = new ConflictFile();
        String[] auxStringArray = message.split("in ");
        result.setParent1FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setParent2FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setAncestorFilePath(auxStringArray[auxStringArray.length - 1]);
        result.setConflictFilePath(ConflictFile.BOTH_FILES);
        result.setConflictFileType(ConflictFileType.CONTENT);
        return result;
    }

    //CONFLICT (add/add): Merge conflict in src/java/voldemort/client/protocol/admin/AdminClientConfig.java
    private static ConflictFile coincidenceAddingType(String message) {
        ConflictFile result = new ConflictFile();
        String[] auxStringArray = message.split("in ");
        result.setParent1FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setParent2FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setAncestorFilePath(null);
        result.setConflictFilePath(ConflictFile.BOTH_FILES);
        result.setConflictFileType(ConflictFileType.COINCIDENCE_ADDING);
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
    private static ConflictFile doubleRenameType(String message) {
        ConflictFile result = new ConflictFile();
        String[] auxStringArray = message.split(": ");
        String auxString;
        if (auxStringArray[auxStringArray.length - 1].contains("Rename directory")) {
            auxString = auxStringArray[auxStringArray.length - 1].replaceAll("Rename directory ", "");
            result.setConflictFileType(ConflictFileType.DIRECTORY_RENAME);
        } else {
            auxString = auxStringArray[auxStringArray.length - 1].replaceAll("Rename ", "").replaceAll("\"", "").replaceAll(" rename ", ". ").replaceAll("branch ", "");
            result.setConflictFileType(ConflictFileType.FILE_RENAME);
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
        result.setConflictFilePath(ConflictFile.BOTH_FILES);
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
    private static ConflictFile modifyDeleteType(String message) {
        ConflictFile result = new ConflictFile();
        String[] auxStringArray = message.split(": ");
        auxStringArray = auxStringArray[auxStringArray.length - 1].split(" deleted in ");
        if (auxStringArray[auxStringArray.length - 1].startsWith("HEAD")) {
            result.setParent1FilePath(null);
            result.setParent2FilePath(auxStringArray[0]);
            result.setConflictFilePath(ConflictFile.PARENT2_FILE);
        } else {
            result.setParent1FilePath(auxStringArray[0]);
            result.setParent2FilePath(null);
            result.setConflictFilePath(ConflictFile.PARENT1_FILE);
        }
        result.setAncestorFilePath(auxStringArray[0]);
        result.setConflictFileType(ConflictFileType.MODIFY_DELETE);
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
    private static ConflictFile renameDeleteType(String message) {
        ConflictFile result = new ConflictFile();
        String[] auxStringArray = message.split(": ")[1].split("\\. ");
        String auxString = auxStringArray[0].replaceAll(" deleted in ", " ").replaceAll(" and renamed to ", " ").replaceAll(" in ", " ");
        auxStringArray = auxString.split(" ");
        result.setAncestorFilePath(auxStringArray[0]);
        if (auxStringArray[1].equals("HEAD")) {
            result.setParent1FilePath(null);
            result.setParent2FilePath(auxStringArray[2]);
            result.setConflictFilePath(ConflictFile.PARENT2_FILE);
        } else {
            result.setParent1FilePath(auxStringArray[2]);
            result.setParent2FilePath(null);
            result.setConflictFilePath(ConflictFile.PARENT1_FILE);
        }
        result.setConflictFileType(ConflictFileType.RENAME_DELETE);
        return result;
    }

    /*
    
    CONFLICT (rename/add): Rename 
    tool/src/org/antlr/v4/codegen/model/LL1StarBlock.java->runtime/Cpp/runtime/atn/PrecedencePredicateTransition.cpp 
    in 014d9fd59397ab6434ce29447ef8d27e558a38e5.  Added runtime/Cpp/runtime/atn/PrecedencePredicateTransition.cpp in HEAD
    
     */
    private static ConflictFile renameAddType(String message) {
        ConflictFile result = new ConflictFile();
        String[] auxStringArray = message.split(": Rename")[1].split("\\. ");
        String auxString = auxStringArray[0];
        auxStringArray = auxString.split("->");
        result.setAncestorFilePath(auxStringArray[0]);
        if (auxStringArray[1].contains("in HEAD")) {
            result.setConflictFileType(ConflictFileType.P1_RENAMED_P2_ADD);
        } else {
            result.setConflictFileType(ConflictFileType.P2_RENAMED_P1_ADD);
        }
        auxString = auxStringArray[1].split(" in ")[0];
        result.setParent1FilePath(auxString);
        result.setParent2FilePath(auxString);
        result.setConflictFilePath(ConflictFile.BOTH_FILES);
        return result;
    }

    /*
    
    CONFLICT (file location): folder/file2.txt added in HEAD inside a directory that was renamed in branch1, 
    suggesting it should perhaps be moved to folderRenamed/file2.txt.
    
    CONFLICT (file location): tool/test/org/antlr/v4/test/rt/gen/grammars/ParserExec/ParserProperty.st added
    in HEAD inside a directory that was renamed in e248be48d14ccce15f79d3623bd131de2082c99f, suggesting it
    should perhaps be moved to
    antlr4-testgen-maven-plugin/resources/org/antlr4/runtime/test/templates/ParserExec/ParserProperty.st.
    
     */
    private static ConflictFile fileLocationType(String message) {
        ConflictFile result = new ConflictFile();
        result.setConflictFileType(ConflictFileType.FILE_LOCATION);
        result.setAncestorFilePath(null);
        message = message.split(": ")[1].replaceAll(" added in", "").replaceAll(" inside a directory that was renamed in", "").replaceAll(", suggesting it should perhaps be moved to", "");
        String[] auxStringArray = message.split(" ");
        if (auxStringArray[1].equals("HEAD")) {
            result.setParent1FilePath(auxStringArray[0]);
            result.setParent2FilePath(auxStringArray[3]);
            result.setConflictFilePath(ConflictFile.PARENT2_FILE);
        } else {
            result.setParent1FilePath(auxStringArray[3]);
            result.setParent2FilePath(auxStringArray[0]);
            result.setConflictFilePath(ConflictFile.PARENT1_FILE);
        }
        return result;
    }

    /*
    
    CONFLICT (submodule): Merge conflict in reference/antlr4
    
     */
    private static ConflictFile submoduleType(String message) {
        ConflictFile result = new ConflictFile();
        String[] auxStringArray = message.split("in ");
        result.setParent1FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setParent2FilePath(auxStringArray[auxStringArray.length - 1]);
        result.setConflictFilePath(ConflictFile.BOTH_FILES);
        result.setAncestorFilePath(null);
        result.setConflictFileType(ConflictFileType.SUBMODULE);
        return result;
    }

    /*
 
    CONFLICT (directory rename split): Unclear where to place modules/ocl/src/opencl/arithm_bitwise.cl 
    because directory modules/ocl/src was renamed to multiple other directories, 
    with no destination getting a majority of the files.
    
    CONFLICT (directory rename split): Unclear where to place modules/gpu/src/cuda/build_point_list.cu because directory modules/gpu/src/cuda was renamed to multiple other directories, with no destination getting a majority of the files.
    
     */
    private static ConflictFile directoryRenameSplitType(String message) {
        ConflictFile result = new ConflictFile();
        String auxString = message.replace("CONFLICT (directory rename split): Unclear where to place ", "").replace("because directory ", "");
        String[] auxStringArray = message.split(" ");
        result.setParent1FilePath(auxStringArray[1] + " or no");
        result.setParent2FilePath(auxStringArray[1] + " or no");
        result.setConflictFilePath(ConflictFile.UNKNOWM);
        result.setAncestorFilePath(auxStringArray[1]);
        result.setConflictFileType(ConflictFileType.DIRECTORY_RENAME_SPLIT);
        return result;
    }

}