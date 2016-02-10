package runtime;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import runtime.AntlrVTLListener;
import parser.VTLLexer;
import parser.VTLParser;

/**
 * This class executes the statements.
 */
public class StatementExecutor {

    private Environment env;

    public StatementExecutor(Environment env) {
        this.env = env;
    }

    public void executeStatementFromString(String cmdString) {

        try {

            VTLLexer lexer = new VTLLexer(new ANTLRInputStream(cmdString));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            VTLParser parser = new VTLParser(tokens);

            VTLParser.CommandContext commandContext = parser.command();
            ParseTreeWalker walker = new ParseTreeWalker();

            AntlrVTLListener listener = new AntlrVTLListener(this.env);

            /* walks and executes the statement */
            walker.walk(listener, commandContext);

        } catch (RecognitionException e) {
            throw new IllegalStateException("Recognition exception is never thrown, only declared.");
        }


    }
}
