import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String scanned = scanner.next();
            input.add(scanned);
        }

        for (String string:input) {
            System.out.println(string);
        }
    }
}