package runtime.logicalOperators;

import runtime.Function;

/**
 * Created by Roberto on 18/03/2016.
 */
public class MajorEqualScalarOperator extends Function<Boolean>{
    private String a,b;

    public MajorEqualScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Boolean performOperation() {
        return Double.parseDouble(this.b) >= Double.parseDouble(this.a);
    }
}
