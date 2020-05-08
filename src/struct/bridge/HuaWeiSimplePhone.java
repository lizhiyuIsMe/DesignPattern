package struct.bridge;

import struct.bridge.brand.HuaWeiBrand;

public class HuaWeiSimplePhone extends Phone{

    public HuaWeiSimplePhone() {
        HuaWeiBrand huaWeiBrand = new HuaWeiBrand();
        this.setBrand(huaWeiBrand);
    }

    @Override
    public void customFun() {
        System.out.println("华为手机 按键版");
    }

}