import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String room = scanner.next();

        switch (room) {
            case "triangle" :
                double a = Double.parseDouble(scanner.next());
                double b = Double.parseDouble(scanner.next());
                double c = Double.parseDouble(scanner.next());
                System.out.println(triangle(a, b, c));
                break;
            case "rectangle" :
                double d = Double.parseDouble(scanner.next());
                double e = Double.parseDouble(scanner.next());
                System.out.println(rectangle(d, e));
                break;
            case "circle" :
                double r = Double.parseDouble(scanner.next());
                System.out.println(circle(r));
                break;
        }
        scanner.close();
    }

    public static double triangle(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        double firstSide = p - a;
        double secondSide = p - b;
        double thirdSide = p - c;
        double x = firstSide * secondSide * thirdSide;
        double y = p * x;
        return Math.sqrt(y);
    }

    public static double rectangle(double a, double b) {
        return a * b;
    }

    public static double circle(double r) {
        return 3.14  * Math.pow(r, 2);
    }

}
