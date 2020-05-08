package struct.decorate;

public class Coffeen extends Drink {
    @Override
    int cost() {
        return super.getMoney();
    }
}
