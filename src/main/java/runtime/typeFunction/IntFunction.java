package runtime.typeFunction;

import runtime.Function;

/**
 * Created by roberto on 16/04/16.
 */
public class IntFunction extends Function<Integer> {
    private String a;

    public IntFunction(String a){
        this.a = a;
    }

    @Override
    public Integer performOperation() {
        return null;
    }

    public String toString(){return this.a;}
}
