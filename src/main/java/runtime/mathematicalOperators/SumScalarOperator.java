package runtime.mathematicalOperators;

import jdk.nashorn.internal.codegen.types.NumericType;
import model.Component;
import model.ComponentType;
import model.Dataset;
import persistence.DatasetNotFoundException;
import persistence.MongoAdapter;
import runtime.Function;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Roberto on 23/02/2016.
 */

public class SumScalarOperator extends Function<Double> implements Serializable {

    private String a,b;

    public SumScalarOperator (String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double performOperation() {
            return (Double.parseDouble(this.b)) + Double.parseDouble(this.a);
    }

    public String toString(){
        return this.a + "&" + this.b;
    }


}


