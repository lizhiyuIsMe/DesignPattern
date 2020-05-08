package action.observer;

/**
 * 所有观察者都要实现的接口
 */
public interface ObserverInter {
    void update(Subject subject);
}
