package runtime.validationOperators;

import runtime.Function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roberto on 18/03/2016.
 */
public class MatchCharactersScalarOperator extends Function<Boolean> {
    String a, b;

    public MatchCharactersScalarOperator(String a, String b){
        this.a = a;
        this.b = b;
        Pattern p = Pattern.compile("(\\d|\\D)+");
    }

    @Override
    public Boolean performOperation() {
        String str = this.b.substring(1, this.b.length()-1);
        String s = "\""+str+"\"";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher(this.a);
        if(m.find())
            return true;
        else
            return false;
    }

    public String toString(){
        return this.a + "&" + this.b;
    }

}
