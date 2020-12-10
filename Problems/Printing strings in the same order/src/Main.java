import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            String scanned = scanner.next();
            input.add(scanned);
        }

        for (String string:input) {
            System.out.println(string);
        }
    }
}