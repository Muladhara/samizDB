package runtime.logicalOperators;

import runtime.Function;

/**
 * Created by Roberto on 08/03/2016.
 */
public class OrScalarOperator extends Function<Boolean>{
    private String a,b;

    public OrScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Boolean performOperation() {
        return Boolean.parseBoolean(this.b) | Boolean.parseBoolean(this.a);
    }

    public String toString(){
        return this.a + "&" + this.b;
    }
}
