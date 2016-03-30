package runtime.stringOperators;

/**
 * Created by Roberto on 16/03/2016.
 */
public class InvalidOperandException extends Exception {
    public InvalidOperandException(String message){
        super(message);
    }
}
