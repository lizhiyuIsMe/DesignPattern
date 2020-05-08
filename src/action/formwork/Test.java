package action.formwork;

public class Test extends Parent{
    public static void main(String[] args) {
        Parent test=new Test();
        test.run();
    }

    @Override
    protected void start() {
        System.out.println("start");
    }

    @Override
    protected void stop() {
        System.out.println("stop");
    }
}
