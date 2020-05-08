package action.chain;

public abstract class DoSomething {
    //本类执行完要执行的下一个类
    private DoSomething doSomething;


    abstract  void doSomething(Me me);

    public DoSomething getDoSomething() {
        return doSomething;
    }

    public void setDoSomething(DoSomething doSomething) {
        this.doSomething = doSomething;
    }
}
