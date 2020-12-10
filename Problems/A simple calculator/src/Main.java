import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = Long.parseLong(scanner.next());
        String operation = scanner.next();
        long secondNumber = Long.parseLong(scanner.next());

        try {
            switch (operation) {
                case "+":
                    System.out.println(addition(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(subtraction(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println(integerDivision(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println(multiplication(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Unknown operator");
                    break;
            }
        } catch (ArithmeticException exception) {
            System.out.println("Division by 0!");
        }
    }

    public static long addition(long firstNumber, long secondNumber) {
        return firstNumber + secondNumber;
    }

    public static long subtraction(long firstNumber, long secondNumber) {
        return firstNumber - secondNumber;
    }

    public static long integerDivision(long firstNumber, long secondNumber) {
        return firstNumber / secondNumber;
    }

    public static long multiplication(long firstNumber, long secondNumber) {
        return firstNumber * secondNumber;
    }
}
