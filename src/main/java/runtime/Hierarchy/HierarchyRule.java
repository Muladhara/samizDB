package runtime.Hierarchy;

import console.ConsoleManager;
import runtime.Function;

import java.util.*;
import java.util.logging.ConsoleHandler;

/**
 * Created by Roberto on 18/03/2016.
 */
public class HierarchyRule {

    Map<String,LinkedList<String>> associations;
    LinkedList<Condition> conditions;

    public HierarchyRule (Map<String,LinkedList<String>> associations, LinkedList<Condition> conditions){
        this.associations = associations;
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        String message = "";
        Set<String> keys = associations.keySet();
        LinkedList<String> values;
        for(String k : keys){
            message = message + (k + " = ");
            values = associations.get(k);
            for(String v : values){
                message = message + (v + "+");
            }
            message = message + ("\n");
        }
        for(Condition c : conditions){
            message = message + c.toString();
        }
        return message;
    }

}
