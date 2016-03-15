package runtime.mathematicalOperators;

import model.ComponentType;
import runtime.Function;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 * Created by Roberto on 03/03/2016.
 */
public class RoundScalarOperator extends Function<Double> {
    private String a,b;

    public RoundScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public Double performOperation() {
        return round(Double.parseDouble(this.b), Integer.parseInt(this.a));
    }

}
