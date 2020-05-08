package action.chain;

public class BrushTooth extends DoSomething{
    @Override
    void doSomething(Me me) {
        System.out.println("刷牙");
        //下一个调用的对象执行
        super.getDoSomething().doSomething(me);
    }
}
