package machine;

public class Cappuccino extends Coffee {

    private int water = 200;
    private int milk = 100;
    private int coffeeBeans = 12;

    private int cost = 6;

    public Cappuccino() {
    }

    @Override
    public int getWater() {
        return water;
    }

    @Override
    public int getMilk() {
        return milk;
    }

    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCost() {
        return cost;
    }
}
