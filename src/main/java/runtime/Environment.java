package runtime;

import runtime.Hierarchy.HierarchyRule;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Environment {

    /* a map of the result function for the various parts of the */
    /* syntax tree */
    Map<String, Function> resultFunctions = new HashMap<String, Function>();
    LinkedList<String> operands = new LinkedList<>();
    Map<String, HierarchyRule> rules = new HashMap<>();

    public Map<String, Function> getResultFunctions () { return this.resultFunctions;}

    public LinkedList<String> getOperands(){return this.operands;}

    public void setResultFunction(String ctx, Function f) {
        this.resultFunctions.put(ctx, f);
    }

    public Function getResultfunction(String ctx) {
        return this.resultFunctions.get(ctx);
    }

    public String getOperand(){return this.operands.poll();}

    public void setOperand(String s){
        this.operands.addFirst(s);
    }

    public void clearOperands(){ this.operands.clear();}

    public void setRule(String id, HierarchyRule h){ this.rules.put(id, h);}

    public HierarchyRule getRule(String id){ return this.rules.get(id);}

}
