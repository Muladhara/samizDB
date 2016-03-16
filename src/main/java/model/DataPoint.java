package model;

import java.util.*;

/**
 * A DataPoint is a collection of Component, each denoted by a name and with a value.
 */
public class DataPoint {
    Map<String, Component> components = new HashMap<String, Component>();
    Map<String, VTLValue> cells = new HashMap<String, VTLValue>();

    public void addVTLValueFromString(String componentName, String value) {
        cells.put(componentName,new VTLValue(value));
    }

    public void createComponentByNameTypeRole(String componentName, ComponentType componentType, ComponentRole componentRole) {
        if(!this.components.containsKey(componentName))
            this.components.put(componentName, new Component(componentName, componentType, componentRole));
    }

    public String toString() {
        Set<String> keys = this.cells.keySet();
        StringBuffer sb = new StringBuffer();
        for(String k : keys) {
            //System.out.println(k + " " + this.cells.get(k));
            if (!this.components.get(k).getRole().equals(ComponentRole.METADATA)) {
                sb.append(k).append(": ").append(this.cells.get(k)).append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }

}