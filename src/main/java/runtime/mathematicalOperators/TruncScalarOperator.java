package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class TruncScalarOperator extends Function<Double> {
    private String a,b;

    public TruncScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    public static double trunc(double value, double places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        int p = (int)places;
        bd = bd.setScale(p, RoundingMode.DOWN);
        return bd.doubleValue();
    }

    @Override
    public Double performOperation() {
        return trunc(Double.parseDouble(this.b),Double.parseDouble(this.a));
    }

    public String toString(){
        return this.a + "&" + this.b;
    }

}
