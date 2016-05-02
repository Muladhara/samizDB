package runtime.typeFunction;

import runtime.Function;

/**
 * Created by roberto on 16/04/16.
 */
public class DoubleFunction extends Function<Double> {
    private String a;

    public DoubleFunction(String a){
        this.a = a;
    }


    @Override
    public Double performOperation() {
        return null;
    }

    public String toString(){return this.a;}
}
