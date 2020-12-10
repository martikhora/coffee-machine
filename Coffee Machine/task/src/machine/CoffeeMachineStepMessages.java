package machine;

public enum CoffeeMachineStepMessages {

    STARTING("Starting to make a coffee"),
    GRINDING("Grinding coffee beans"),
    BOILING("Boiling water"),
    MIXING("Mixing boiled water with crushed coffee beans"),
    COFFEE("Pouring coffee into the cup"),
    MILK("Pouring some milk into the cup"),
    READY("Coffee is ready!");



    String message;

    CoffeeMachineStepMessages(String message) {
        this.message = message;
    }
}
