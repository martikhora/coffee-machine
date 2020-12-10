package machine;

import java.util.Scanner;

public class CoffeeMachineInside {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void defaultSetOfResources(int water, int milk, int coffeeBeans, int cups, int money) {
        setWater(water);
        setMilk(milk);
        setCoffeeBeans(coffeeBeans);
        setCups(cups);
        setMoney(money);
    }

    Scanner scanner = new Scanner(System.in);

    public void go () {
        defaultSetOfResources(400, 540, 120, 9, 550);
        selectAction();
    }

    public void selectAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.next();

        try {
            switch (action) {
                case "buy":
                    System.out.println();
                    buy();
                    break;
                case "fill":
                    System.out.println();
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    System.out.println();
                    checkResources();
                    break;
                case "exit":
                    break;
            }
        } catch (Exception exception) {
        }
    }

    public void buy() {
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                "back - to main menu:" + '\n');

        String choice = scanner.next();


        switch (choice) {
            case "1":
                Coffee espresso = new Espresso();
                resources(espresso.getWater(), espresso.getCoffeeBeans());
                setResourcesAfterUse(espresso.getWater(), espresso.getCoffeeBeans(), espresso.getCost());
                selectAction();
                break;
            case "2":
                Coffee latte = new Latte();
                resources(latte.getWater(), latte.getMilk(), latte.getCoffeeBeans());
                setResourcesAfterUse(latte.getWater(), latte.getMilk(), latte.getCoffeeBeans(), latte.getCost());
                selectAction();
                break;
            case "3":
                Cappuccino cappuccino = new Cappuccino();
                resources(cappuccino.getWater(), cappuccino.getMilk(), cappuccino.getCoffeeBeans());
                setResourcesAfterUse(cappuccino.getWater(), cappuccino.getMilk(), cappuccino.getCoffeeBeans(),
                        cappuccino.getCost());

                selectAction();
                break;
            case "back":
                System.out.println();
                selectAction();
                break;
        }
    }

    public void setResourcesAfterUse(int water, int coffeeBeans, int cost) {
        setWater(getWater() - water);
        setCoffeeBeans(getCoffeeBeans() - coffeeBeans);
        setMoney(getMoney() + cost);
        setCups(getCups() - 1);
    }

    public void setResourcesAfterUse(int water, int milk, int coffeeBeans, int cost) {
        setWater(getWater() - water);
        setMilk(getMilk() - milk);
        setCoffeeBeans(getCoffeeBeans() - coffeeBeans);
        setMoney(getMoney() + cost);
        setCups(getCups() - 1);
    }

    public void resources(int water, int coffeeBeans) {
        if (getWater() >= water & getCoffeeBeans() >= coffeeBeans) {
            System.out.println("I have enough resources, making you a coffee!" + '\n');
        }
        else if (getWater() < water) {
            System.out.println("Sorry, not enough water!" + '\n');
            selectAction();
        }
        else if (getCoffeeBeans() < coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!" + '\n');
            selectAction();
        }
    }

    public void resources(int water, int milk, int coffeeBeans) {
        if (getWater() >= water & getMilk() >= milk &
                getCoffeeBeans() >= coffeeBeans) {
            System.out.println("I have enough resources, making you coffee!" + '\n');
        }
        else if (getWater() < water) {
            System.out.println("Sorry, not enough water!" + '\n');
            selectAction();
        }
        else if (getMilk() < milk) {
            System.out.println("Sorry, not enough milk!" + '\n');
            selectAction();
        }
        else if (getCoffeeBeans() < coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!" + '\n');
            selectAction();
        }
    }

    public void fill() {

        System.out.print("Write how many ml of water do you want to add: " + '\n');
        String waterAmount = scanner.next();
        int water = Integer.parseInt(waterAmount);
        setWater(getWater() + water);

        System.out.print("Write how many ml of milk do you want to add: " + '\n');
        String milkAmount = scanner.next();
        int milk = Integer.parseInt(milkAmount);
        setMilk(getMilk() + milk);

        System.out.print("Write how many grams of coffee beans do you want to add: " + '\n');
        String coffeeBeansAmount = scanner.next();
        int coffeeBeans = Integer.parseInt(coffeeBeansAmount);
        setCoffeeBeans(getCoffeeBeans() + coffeeBeans);

        System.out.print("Write how many disposable cups do you want to add: " + '\n');
        String cupsAmount = scanner.next();
        int cups = Integer.parseInt(cupsAmount);
        setCups(getCups() + cups);
        System.out.println();
        selectAction();
    }

    public void take() {
        int money = getMoney();
        System.out.println("I gave you $" + getMoney() + '\n');
        setMoney(getMoney() - money);
        selectAction();
    }

    public void checkResources() {
        if (getMoney() > 0) {
            System.out.println("The coffee machine has:" + '\n' +
                    getWater() + " of water" + '\n' +
                    getMilk() + " of milk" + '\n' +
                    getCoffeeBeans() + " of coffee beans" + '\n' +
                    getCups() + " of disposable cups" + '\n' +
                    "$" + getMoney() + " of money" + '\n');
        } else {
            System.out.println("The coffee machine has:" + '\n' +
                    getWater() + " of water" + '\n' +
                    getMilk() + " of milk" + '\n' +
                    getCoffeeBeans() + " of coffee beans" + '\n' +
                    getCups() + " of disposable cups" + '\n' +
                    getMoney() + " of money" + '\n');
        }
        selectAction();
    }

    @Deprecated
    public void printSteps() {
        for (CoffeeMachineStepMessages steps : CoffeeMachineStepMessages.values()) {
            System.out.println(steps.message);
        }
    }

    @Deprecated
    public void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need:" + '\n' + "> ");
        String cups = scanner.next();

        Coffee simpleCoffee = new Coffee();
        simpleCoffee.cupsOfCoffeeCount(Integer.parseInt(cups));

    }

    @Deprecated
    public static void checkingAmount() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: " + '\n');
        int water = Integer.parseInt(scanner.nextLine());

        System.out.print("Write how many ml of milk the coffee machine has: " + '\n');
        int milk = Integer.parseInt(scanner.nextLine());

        System.out.print("Write how many grams of coffee beans the coffee machine has: " + '\n');
        int coffee = Integer.parseInt(scanner.nextLine());

        System.out.print("Write how many cups of coffee you will need: " + '\n');
        int cups = Integer.parseInt(scanner.nextLine());

        Coffee receipt = new Coffee();

        if (water >= 0 & milk >= 0 & coffee >= 0) {

            int isEnoughWater = water / receipt.getWater();
            int isEnoughMilk = milk / receipt.getMilk();
            int isEnoughCoffee = coffee / receipt.getCoffeeBeans();

            int minCupsAmount = Math.min(isEnoughWater, isEnoughMilk);
            int minCupsAmount1 = Math.min(isEnoughCoffee, minCupsAmount);

            if (minCupsAmount1 >= cups)
                System.out.print("Yes, I can make that amount of coffee");
            {
                if (minCupsAmount1 > cups)
                    System.out.print(" (and even " + (minCupsAmount1 - cups) + " more than that)");
            }
            if (minCupsAmount1 < cups) {
                System.out.print("No, I can make only " + minCupsAmount1 + " cup(s) of coffee");
            }
        }
    }
}
