package struct.bridge;

public abstract class Phone {
    private Brand brand;

    public void start(){
        brand.start();
        customFun();
    }
    public void close(){
        brand.close();
        customFun();
    }

    public abstract void customFun();

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
