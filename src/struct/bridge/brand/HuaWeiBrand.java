package struct.bridge.brand;

import struct.bridge.Brand;

public class HuaWeiBrand implements Brand {
    @Override
    public void start() {
        System.out.println("hua wei start");
    }

    @Override
    public void close() {
        System.out.println("hua wei close");
    }
}