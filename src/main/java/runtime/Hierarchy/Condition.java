package runtime.Hierarchy;

/**
 * Created by Roberto on 18/03/2016.
 */
public class Condition {
    String when, operator, constraint, value;

    public Condition(String when, String operator, String constraint, String value){
        this.when = when;
        this.operator = operator;
        this.constraint = constraint;
        this.value = value;
    }

    @Override
    public String toString(){
        return "when " + this.when + " " + this.operator + " " + this.constraint + " then " + this.value + "\n";
    }
}
