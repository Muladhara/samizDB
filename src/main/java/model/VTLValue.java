package model;

public class VTLValue {
    private String value;
    private ComponentType type;


    public VTLValue(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value.toString();
    }
}