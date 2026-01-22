package programs.Task2;

public class Typeconversion {
    void show() {
        // Implicit type conversion (widening)
        int a = 10;
        double b = a; // int automatically converted to double
        System.out.println("Implicit type conversion:");
        System.out.println("Int value: " + a);
        System.out.println("Double value: " + b);

        // Explicit type conversion (narrowing)
        double x = 45.67;
        int y = (int)x; // double explicitly converted to int
        System.out.println("Explicit type conversion:");
        System.out.println("Double value: " + x);
        System.out.println("Int value: " + y);
    }
}
