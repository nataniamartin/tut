package calculator;

import trigonometry.Trigonometry;
import matrix.Matrix;
import equation.Equation;

public class Calculator {

    static final String NAME = "Advanced Calculator";

    private static int count = 0;

    public static void main(String[] args) {

        System.out.println(NAME);

        count++;

        System.out.println("\n--- Trigonometry ---");
        System.out.println("Sin 30 = " + Trigonometry.sine(30));
        System.out.println("Cos 60 = " + Trigonometry.cosine(60));

        System.out.println("\n--- Matrix ---");
        Matrix.add(2, 3, 4, 5);

        System.out.println("\n--- Equation ---");
        Equation.solve(2, 4);

        System.out.println("\nCalculator used " + count + " time(s)");
    }
}