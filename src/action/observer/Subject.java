package action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被监测的对象
 */
public abstract class Subject {
    private List<ObserverInter> observerList=new ArrayList<ObserverInter>();

    //表示观察者对目标对象（被观察者）开始观察
    public void registerObserver(ObserverInter obs) {
        observerList.add(obs);
    }
    //表示取消某观察者对目标对象（被观察者）的观察
    public void unRegisterObserver(ObserverInter obs) {
        observerList.remove(obs);
    }
    //当目标对象（被观察者）的状态发生变化时，及时更新观察者的状态
    public void notifyAllObserver(){
        for (ObserverInter observer : observerList) {
            observer.update(this);
        }
    }
}
