/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.gmr.core.mergenature.antlr4;

import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Lexer;
import br.ufjf.dcc.gmr.core.mergenature.antlr4.grammars.java9.Java9Parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.UnbufferedTokenStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Heleno
 */
public class ANTLR4ToolsMemoryTest {

    public ANTLR4ToolsMemoryTest() {
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
    public void ANTLR4ParseMemoryTest() {
        String path = "src/test/resources";
        File file = new File(path + "/BigJavaFile");
        try {
            InputStream input = new FileInputStream(file);
            Java9Lexer lexer = new Java9Lexer(new ANTLRInputStream(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Java9Parser parser = new Java9Parser(tokens);
            parser.compilationUnit();
        } catch (IOException | RecognitionException ex) {
            fail("Some error occurred.");
        }
    }
}
