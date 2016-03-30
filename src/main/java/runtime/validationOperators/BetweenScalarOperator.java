package runtime.validationOperators;

import console.ConsoleManager;
import org.apache.commons.lang3.math.NumberUtils;
import runtime.Function;

/**
 * Created by Roberto on 18/03/2016.
 */
public class BetweenScalarOperator extends Function<Boolean> {
    String a, b, c;

    public BetweenScalarOperator(String a, String b, String c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public Boolean performOperation() {
        if(NumberUtils.isNumber(this.b) && NumberUtils.isNumber(this.a) && NumberUtils.isNumber(this.c) )
            return inNumber(Double.parseDouble(this.a), Double.parseDouble(this.b), Double.parseDouble(this.c));
        else if(this.c.charAt(0)=='"' && this.c.charAt(this.c.length()-1)=='"' &&
                this.b.charAt(0)=='"' && this.b.charAt(this.c.length()-1)=='"' &&
                this.a.charAt(0)=='"' && this.a.charAt(this.c.length()-1)=='"')
            return inString(this.a, this.b, this.c);
        else{
            ConsoleManager.printMessage("Component inserted is not a string or a number");
            return null;
        }

    }

    private Boolean inNumber(double v, double v1, double v2) {
        return v2>=v1 && v2<=v;
    }

    private Boolean inString(String a, String b, String c){
        if(c.compareTo(b)>=0 && (c.compareTo(a)==0 || c.compareTo(a)<0))
            return true;
        else
            return false;
    }
}
