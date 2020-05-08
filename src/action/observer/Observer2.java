package action.observer;

public class Observer2 implements ObserverInter{
    @Override
    public void update(Subject subject) {
        ConcreteSubject subject1 = (ConcreteSubject) subject;
        String name = subject1.getName();
        System.out.println("Observer2 watch name is " + name);
    }
}
