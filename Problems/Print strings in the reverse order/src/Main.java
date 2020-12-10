import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String scanned = scanner.next();
            strings.add(scanned);
        }

        for (int i = 2; i >= 0; i--) {

            System.out.println(strings.get(i));

        }
    }
}
