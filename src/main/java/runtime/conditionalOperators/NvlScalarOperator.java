package runtime.conditionalOperators;

import runtime.Function;

/**
 * Created by Roberto on 18/03/2016.
 */
public class NvlScalarOperator extends Function<Object> {
    private String a,b;

    public NvlScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Object performOperation() {
        if(this.b!=null)
            return this.b;
        else
            return this.a;
    }
}
