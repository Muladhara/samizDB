package runtime;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Environment {

    /* a map of the result function for the various parts of the */
    /* syntax tree */
    Map<String, Function> resultFunctions = new HashMap<String, Function>();
    LinkedList<String> operands = new LinkedList<>();

    public void setResultFunction(String ctx, Function f) {
        this.resultFunctions.put(ctx, f);
    }

    public Function getResultfunction(String ctx) {
        return this.resultFunctions.get(ctx);
    }

    public String getOperand(){
        return this.operands.poll();
    }

    public void setOperand(String s){
        this.operands.addFirst(s);
    }

}
