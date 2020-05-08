package action.memento;

public class GameRole  implements Cloneable{
    private String state;

    //创建备忘录
    public Memento setMemento(String name) throws CloneNotSupportedException {
        GameRole gameRole= (GameRole) this.clone();
        Memento memento = new Memento(gameRole);
        ManageMemento.add(name,memento);
        return  memento;
    }

    //获得备忘录
    public Memento getMemento(String name) {
        return  ManageMemento.get(name);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
