package struct.decorate;

public class Milk extends DecorateDrink{
    public Milk(Drink drink) {
        super(drink);
        super.setMoney(5);
    }
}
