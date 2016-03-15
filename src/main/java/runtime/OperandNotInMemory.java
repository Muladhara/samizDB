package runtime;

/**
 * Created by Roberto on 01/03/2016.
 */
public class OperandNotInMemory extends Exception {
    public OperandNotInMemory(String s) {
        super(s);
    }
}
