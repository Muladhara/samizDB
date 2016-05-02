package runtime.validationOperators;

import org.apache.commons.lang3.math.NumberUtils;
import runtime.Function;

import java.util.LinkedList;

/**
 * Created by Roberto on 18/03/2016.
 */
public class InScalarOperator extends Function<Boolean> {
    String a,b;

    public InScalarOperator(String a, String b ){
        this.a = a;
        this.b = b;
    }


    @Override
    public Boolean performOperation() {
        if(NumberUtils.isNumber(this.b))
            return inNumber(this.a, Double.parseDouble(this.b));
        else if (((this.a.equalsIgnoreCase("false")) || this.a.equalsIgnoreCase("true")))
            return inBoolean(this.a, Boolean.parseBoolean(this.b));
        else
            return inString(this.a, this.b);
    }

    private Boolean inString(String a, String b) {
        String s = a.substring(1, a.length()-1);
        LinkedList<String> list = new LinkedList<>();
        for(String element : s.split(",")){
            list.addFirst(element);
        }
        if(list.contains(b))
            return true;
        else
            return false;
    }

    private Boolean inNumber(String a, double v) {
        String s = a.substring(1, a.length()-1);
        LinkedList<Double> list = new LinkedList<>();
        if(s.length()!=0){
            for(String element : s.split(",")){
                if(element!=null)
                    list.addFirst(Double.parseDouble(element));
            }
        }
        if(list.contains(v))
            return true;
        else
            return false;
    }

    private Boolean inBoolean(String a, Boolean v) {
        String s = a.substring(0, a.length()-1);
        LinkedList<Boolean> list = new LinkedList<>();
        for(String element : s.split(",")){
            list.addFirst(Boolean.parseBoolean(element));
        }
        if(list.contains(v))
            return true;
        else
            return false;
    }

    public String toString(){
        return this.a + "&" + this.b;
    }



}
