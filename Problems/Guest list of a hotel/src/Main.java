import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        printGuestList(createGuestList());
    }

    public static ArrayList<String> createGuestList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guestList = new ArrayList<>();

        while (guestList.size() < 8) {
            String guestName = scanner.next();
            guestList.add(guestName);
        }
        return guestList;
    }

    static void printGuestList(ArrayList<String> guestList) {
        for (int i = guestList.size() - 1; i >= 0; i--) {
            System.out.println(guestList.get(i));
        }
    }
}
