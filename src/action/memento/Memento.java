package action.memento;

public class Memento {
    private Object memento;
    public Memento(Object memento) {
        this.memento = memento;
    }

    public Object getMemento() {
        return memento;
    }

    public void setMemento(Object memento) {
        this.memento = memento;
    }
}
