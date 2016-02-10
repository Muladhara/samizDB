package runtime;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

public class Environment {

    /* a map of the result function for the various parts of the */
    /* syntax tree */
    Map<String, Function> resultFunctions = new HashMap<String, Function>();

    public void setResultFunction(String ctx, Function f) {
        this.resultFunctions.put(ctx, f);
    }

    public Function getResultfunction(String ctx) {
        return this.resultFunctions.get(ctx);
    }

}
