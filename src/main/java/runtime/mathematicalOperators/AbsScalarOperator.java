package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class AbsScalarOperator extends Function<Double> {
    private String a;

    public AbsScalarOperator (String a) {
        this.a = a;
    }

    @Override
    public Double performOperation() {
        return Math.abs(Double.parseDouble(this.a));
    }
}
