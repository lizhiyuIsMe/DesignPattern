package action.formwork;

public abstract class Parent {
     public final void  run(){
         start();
         say();
         stop();
     }

    protected  void say(){
        System.out.println("haha");
    }

    protected abstract void start();
    protected abstract void stop();

}
