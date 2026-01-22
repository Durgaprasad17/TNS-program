package programs.Task2;
import java.util.Scanner;

public class Multiplicationmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Multiplicationtabl mt = new Multiplicationtabl(); 
        mt.table(number);

        sc.close(); // good practice to close Scanner
    }
}
