package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class DifferenceScalarOperator extends Function<Double> {
    private String a,b;

    public DifferenceScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double performOperation() {
        return Double.parseDouble(this.b) - Double.parseDouble(this.a);
    }
}
