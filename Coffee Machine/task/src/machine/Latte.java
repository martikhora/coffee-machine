package machine;

public class Latte extends Coffee {

    private int water = 350;
    private int milk = 75;
    private int beans = 20;

    private int cost = 7;

    public Latte() {
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
        return beans;
    }

    public int getCost() {
        return cost;
    }
}
