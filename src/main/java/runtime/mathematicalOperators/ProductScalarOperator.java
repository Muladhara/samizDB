package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 02/03/2016.
 */
public class ProductScalarOperator extends Function<Double> {
    private String a,b;

    public ProductScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double performOperation() {
        return Double.parseDouble(a) * Double.parseDouble(b);
    }


}

