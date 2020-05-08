package struct.bridge.brand;

import struct.bridge.Brand;

public class XiaoMiBrand implements Brand {
    @Override
    public void start() {
        System.out.println("xiao mi start");
    }

    @Override
    public void close() {
        System.out.println("xiao mi close");
    }
}
