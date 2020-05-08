package create.builder;


public class CarMain {

    public static void main(String[] args) {
        //指挥者
        CarDirector director = new CarDirector();
        //CreateCarImpl 是建造者
        //如果想另一个东西可以出入别的建造者
        Car car = director.direct(new CreateCarImpl());
        System.out.println(car);
    }
}