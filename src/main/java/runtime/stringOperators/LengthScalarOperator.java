package runtime.stringOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 04/03/2016.
 */
public class LengthScalarOperator extends Function<Integer> {
    private String a;

    public LengthScalarOperator (String a) {
        this.a = a;
    }

    @Override
    public Integer performOperation() {
        return this.a.length();
    }
}
