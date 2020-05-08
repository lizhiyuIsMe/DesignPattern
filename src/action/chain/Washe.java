package action.chain;

public class Washe extends DoSomething{
    @Override
    void doSomething(Me me) {
        System.out.println("洗澡");
        //下一个调用的对象执行
        super.getDoSomething().doSomething(me);
    }
}