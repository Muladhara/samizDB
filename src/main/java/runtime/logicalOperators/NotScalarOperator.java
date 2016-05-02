package runtime.logicalOperators;

import runtime.Function;

/**
 * Created by Roberto on 08/03/2016.
 */
public class NotScalarOperator extends Function<Boolean> {
    private String a;

    public NotScalarOperator (String a) {
        this.a = a;
    }

    @Override
    public Boolean performOperation() {
        return !(Boolean.parseBoolean(this.a));
    }

    public String toString(){
        return this.a ;
    }
}
