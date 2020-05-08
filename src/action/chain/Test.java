package action.chain;

public class Test {
    public static void main(String[] args) {
        Me me=new Me();

        //刷牙
        BrushTooth brushTooth=new BrushTooth();
        //洗澡
        Washe washe=new Washe();
        //閉眼睛
        CloseEye closeEye=new CloseEye();

        //刷牙后洗澡
        brushTooth.setDoSomething(washe);
        //洗澡后閉眼睛
        washe.setDoSomething(closeEye);

        //执行
        brushTooth.doSomething(me);
    }
}
