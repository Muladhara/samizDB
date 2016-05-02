package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class LogScalarOperator extends Function<Double> {
    private String a,b;

    public LogScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double performOperation() {
        return Math.log(Double.parseDouble(this.b)) / Math.log(Double.parseDouble(this.a));
    }

    public String toString(){
        return this.a + "&" + this.b;
    }

}
