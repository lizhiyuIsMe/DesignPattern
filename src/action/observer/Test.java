package action.observer;

public class Test {

    public static void main(String[] args) {
        //创建被监测的对象
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //将监测对象注册到被监测对象上
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        concreteSubject.registerObserver(observer1);
        concreteSubject.registerObserver(observer2);


        concreteSubject.setName("lizhiyu");
    }
}
