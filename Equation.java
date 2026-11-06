package equation;

public class Equation {

    private static final String NAME = "Equation Calculator";

    // Linear equation: ax + b = 0
    public static void linear(double a, double b) {

        System.out.println("\nLinear Equation:");

        if (a != 0) {
            double x = -b / a;
            System.out.println("Value of x = " + x);
        }
        else {
            System.out.println("Invalid equation");
        }
    }

    // Quadratic equation: ax² + bx + c = 0
    public static void quadratic(double a, double b, double c) {

        System.out.println("\nQuadratic Equation:");

        if (a == 0) {
            System.out.println("Not a quadratic equation");
            return;
        }

        double d = (b * b) - (4 * a * c);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Root 1 = " + x1);
            System.out.println("Root 2 = " + x2);
        }

        else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Equal roots = " + x);
        }

        else {
            System.out.println("No real roots");
        }
    }

    public static void main(String[] args) {

        System.out.println(NAME);

        linear(2, 4);

        quadratic(1, -5, 6);
    }
}