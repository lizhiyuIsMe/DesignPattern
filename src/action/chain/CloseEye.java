package action.chain;

public class CloseEye extends DoSomething{
    @Override
    void doSomething(Me me) {
        System.out.println("闭眼睛");
    }
}