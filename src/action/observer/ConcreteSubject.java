package action.observer;

/**
 * 具体被监测的目标对象
 */
public class ConcreteSubject extends Subject {

     private  String name="lizhiyu";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //将自己发送给所有的监听着
        notifyAllObserver();
    }
}
