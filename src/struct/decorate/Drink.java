package struct.decorate;

public abstract class Drink {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    abstract int cost();
}
