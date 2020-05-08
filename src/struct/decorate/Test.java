package struct.decorate;

public class Test {
    public static void main(String[] args) {
        //创建原对象
        BuyCoffeen coffeen=new BuyCoffeen();
        System.out.println("咖啡花掉了"+coffeen.cost()+"元");

        //对对象进行包装
        DecorateDrink decorateDrink = new DecorateDrink(coffeen);
        System.out.println("包装后花掉了"+decorateDrink.cost()+"元");

        //买一杯奶
        Milk milk = new Milk(decorateDrink);
        System.out.println("买牛奶后花掉了"+milk.cost()+"元");

        //买一科糖
        Suger suger = new Suger(milk);
        System.out.println("买糖后花掉了"+suger.cost()+"元");


    }
}
