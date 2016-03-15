package runtime.logicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 04/03/2016.
 */
public class AndScalarOperator extends Function<Boolean> {
    private String a,b;

    public AndScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Boolean performOperation() {
        return Boolean.parseBoolean(this.b) & Boolean.parseBoolean(this.a);
    }
}
