package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class ExpScalarOperator extends Function<Double> {
    private String a;

    public ExpScalarOperator (String a) {
        this.a = a;
    }

    @Override
    public Double performOperation() {
        return Math.exp(Double.parseDouble(this.a));
    }

    public String toString(){
        return this.a;
    }

}
