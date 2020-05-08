package action.observer;

public class Observer1 implements ObserverInter{
    @Override
    public void update(Subject subject) {
        ConcreteSubject subject1 = (ConcreteSubject) subject;
        String name = subject1.getName();
        System.out.println("Observer1 watch name is " + name);
    }
}
