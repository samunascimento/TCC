/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.gmr.core.mergenature.antlr4;

import br.ufjf.dcc.gmr.core.mergenature.controller.MergeMessageReader;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFile;
import br.ufjf.dcc.gmr.core.mergenature.model.ConflictFileType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author luanr
 */
public class TestMergeMessageReader {

    public TestMergeMessageReader() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testContentType() {
        String message = "CONFLICT (content): Merge conflict in Arquivo_1.txt";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.CONTENT);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

    @Test
    public void testContentWithUnilateralRenamingType() {
        String message = "CONFLICT (content): Merge conflict in Arquivo_renomeado.txt";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.CONTENT_WITH_UNILATERAL_RENAMNING);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

    @Test
    public void testRenameType() {
        String message = "CONFLICT (rename/rename): Rename \"Arq_2.txt\"->\"Arquivo_2.txt\" in branch \"HEAD\" rename \"Arq_2.txt\"->\"Arqu_2.txt\" in \"270c174510f2b10492df187d2105d4b97d5c85f7\"";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.FILE_RENAME);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

    @Test
    public void testCoincidenceAddingType() {
        String message = "CONFLICT (add/add): Merge conflict in Arq_2.txt";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.COINCIDENCE_ADDING);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

    @Test
    public void testModifyDeleteType() {
        String message = "CONFLICT (modify/delete): Arquivo_1.txt deleted in e827b731bb2f8ea7e5e121353f5a685165ed4fb1 and modified in HEAD. Version HEAD of Arquivo_1.txt left in tree.";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.MODIFY_DELETE);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

    @Test
    public void testDirRenameType() {
        String message = "Merge branch \'dirRename\'";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.DIRECTORY_RENAME);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

    @Test
    public void testRenameDeleteType() {
        String message = "CONFLICT (rename/delete): Arquivo_2.txt deleted in 5a3281ef88e94892bc10a276878b79eda88ff927 and renamed to Arquivo_2_5.txt in HEAD. Version HEAD of Arquivo_2_5.txt left in tree.";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.RENAME_DELETE);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

    @Test
    public void testPXPYType() {
        String message = "CONFLICT (rename/add): Rename Arquivo_1.txt->Arquivo_novo.txt in ce7ce19e50e124f6e471b2841d7f22bb6bea1ae4.  Added Arquivo_novo.txt in HEAD";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.P2_RENAMED_P1_ADD);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");

    }

    @Test
    public void testModifyLocationType() {
        String message = "CONFLICT (add/add): Merge conflict in Diretorio/Arquivo_novo.txt";
        ConflictFile conflictFile = MergeMessageReader.getConflictFileFromMessage(message);
        assertEquals(conflictFile.getConflictFileType(), ConflictFileType.FILE_LOCATION);
        assertEquals(conflictFile.getAncestorFilePath(), "");
        assertEquals(conflictFile.getParent1FilePath(), "");
        assertEquals(conflictFile.getParent2FilePath(), "");
        assertEquals(conflictFile.getConflictFilePath(), "");
    }

}
