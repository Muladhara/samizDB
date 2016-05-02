package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class LnScalarOperator extends Function<Double> {
    private String a;

    public LnScalarOperator (String a) {
        this.a = a;
    }

    @Override
    public Double performOperation() {
        return Math.log(Double.parseDouble(this.a));
    }

    public String toString(){
        return this.a;
    }

}
