//https://stackoverflow.com/questions/21661899/get-all-antlr-parsing-errors-as-list-of-string
package br.ufjf.dcc.gmr.core.mergenature.antlr4;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Utils;

import java.util.ArrayList;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener
{
    private final List<SyntaxError> syntaxErrors = new ArrayList<>();

    SyntaxErrorListener()
    {
    }

    List<SyntaxError> getSyntaxErrors()
    {
        return syntaxErrors;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {
        syntaxErrors.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }

    @Override
    public String toString()
    {
        return Utils.join(syntaxErrors.iterator(), "\n");
    }
}
