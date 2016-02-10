package model;

public class Component {
    private String name;
    private ComponentRole role;
    private ComponentType type;

    public Component(String name, ComponentType type, ComponentRole role) {
        this.name = name;
        this.role = role;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentRole getRole() {
        return role;
    }

    public void setRole(ComponentRole role) {
        this.role = role;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }
}
