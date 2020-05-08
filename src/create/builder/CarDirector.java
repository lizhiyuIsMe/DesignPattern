package create.builder;

public class CarDirector {

    public Car direct(CreateCar createCar){
        createCar.selectCarDoor();
        createCar.selectColor();
        createCar.selectTires();
        return createCar.createCar();
    };
}