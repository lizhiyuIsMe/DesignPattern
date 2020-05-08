package struct.decorate;

public class DecorateDrink extends Drink {
    //这个是传入的新对象
    private Drink drink;
    public DecorateDrink(Drink drink) {
        this.drink=drink;
    }

    int cost(){
        super.setMoney(super.getMoney()+drink.getMoney());
        return super.getMoney();
    }
}
