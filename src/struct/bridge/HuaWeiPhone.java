package struct.bridge;

import struct.bridge.brand.HuaWeiBrand;

public class HuaWeiPhone extends Phone{

    public HuaWeiPhone() {
        HuaWeiBrand huaWeiBrand = new HuaWeiBrand();
        this.setBrand(huaWeiBrand);
    }

    @Override
    public void customFun() {
        System.out.println("华为手机 触屏版");
    }

}
