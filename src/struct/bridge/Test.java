package struct.bridge;

public class Test {
    public static void main(String[] args) {

        HuaWeiPhone huaWeiPhone = new HuaWeiPhone();
        huaWeiPhone.start();

        HuaWeiSimplePhone huaWeiSimplePhone = new HuaWeiSimplePhone();
        huaWeiSimplePhone.start();
    }
}
