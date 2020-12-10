package machine;

import java.util.Scanner;

public class Coffee {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int cost;

    public Coffee() {
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCost() {
        return cost;
    }

    @Deprecated
    public void cupsOfCoffeeCount(int persons) {

        int waterAmount = getWater() * persons;
        int milkAmount = getMilk() * persons;
        int coffeeBeansAmount = getCoffeeBeans() * persons;

        System.out.println("For " + persons + " cups of coffee you will need:" + '\n' +
                +waterAmount + " ml of water" + '\n' +
                +milkAmount + " ml of milk" + '\n' +
                +coffeeBeansAmount + " g of coffee beans");

    }

}
