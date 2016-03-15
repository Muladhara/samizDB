package runtime.logicalOperators;

import runtime.Function;

/**
 * Created by Roberto on 08/03/2016.
 */
public class XorScalarOperator extends Function<Boolean> {
    private String a,b;

    public XorScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Boolean performOperation() {
        return Boolean.parseBoolean(this.b) ^ Boolean.parseBoolean(this.a);
    }
}
