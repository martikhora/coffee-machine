package machine;

public class Espresso extends Coffee {

    private int water = 250;
    private int coffeeBeans = 16;

    private int cost = 4;

    public Espresso() {
    }

    @Override
    public int getWater() {
        return water;
    }

    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
