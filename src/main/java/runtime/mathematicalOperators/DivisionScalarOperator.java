package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class DivisionScalarOperator extends Function<Double> {
    private String a,b;

    public DivisionScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public Double performOperation() {
        /*The operands order is inverted due to the push on top of the list, indeed the real first operand is put in the list
        * at the head and then the real second is added becoming the first of the list
        * so the list will contain [second parameter, first parameter]*/
        return Double.parseDouble(this.b) / Double.parseDouble(this.a);
    }

    public String toString(){
        return this.a + "&" + this.b;
    }


}
