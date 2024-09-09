package br.ufjf.dcc.gmr.core.mergenature.antlr4;


import br.ufjf.dcc.gmr.core.utils.ListUtils;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ANTLR4Test{

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
    }

    @AfterClass
    public static void afterClass() throws Exception {
    }

    @Test
    public void testGetLanguageConstructs() throws IOException {
        String path = "src/test/resources";
        File file = new File(path + "/TestAntlr.java");
        ANTLR4Results rawResults = ANTLR4Tools.analyzeJava9SyntaxTree(file.getPath(), false);
        ANTLR4Results filteredResults = ANTLR4Tools.filterAndGetOutmost(rawResults, 48, 58);
        List<String> languageConstructs = ANTLR4Tools.getTranslatedStrucutures(filteredResults.getAllOutmosted(), file.getPath(), false, false);
        Collections.sort(languageConstructs);
        String result = ListUtils.getTextListStringToString(languageConstructs);

        // TODO MUDAR PARA LanguageConstructs.FOR_STATEMENT (TODOS)

        String expected = "ForStatement\n" +
                "IfStatement\n" +
                "MethodInvocation\n" +
                "MethodSignature\n" +
                "Variable";

        Assert.assertEquals(result, expected);
    }
}