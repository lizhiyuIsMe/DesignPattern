package struct.composite;

public abstract class Component {
    private String name;
    abstract  void say();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
