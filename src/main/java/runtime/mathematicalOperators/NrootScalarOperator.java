package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class NrootScalarOperator extends Function<Double> {
    private String a,b;

    public NrootScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double performOperation() {
        return Math.pow(Double.parseDouble(this.b), 1/(Double.parseDouble(this.a)));
    }

    public String toString(){
        return this.a + "&" + this.b;
    }

}
