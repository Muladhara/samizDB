package runtime.conditionalOperators;

import console.ConsoleManager;
import runtime.Function;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Roberto on 17/03/2016.
 */
public class IfScalarOperator extends Function<String> {
    private LinkedList<String> l;

    public IfScalarOperator(LinkedList<String> l){
        this.l = l;
    }

    @Override
    public String performOperation() {
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (!it.hasNext())
                return s;
            if(!(s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false"))){
                ConsoleManager.printMessage("Not a boolean expression");
                break;
            }

            if (s.equalsIgnoreCase("true"))
                return it.next();
            else
                s = it.next();

        }
        return null;
    }
}
