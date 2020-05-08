package struct.decorate;

public class Suger  extends DecorateDrink{
    public Suger(Drink drink) {
        super(drink);
        super.setMoney(1);
    }
}