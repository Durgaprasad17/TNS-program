package programs.Day3;
import java.util.Scanner;

public class Durga {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();   // 🔗 LINK CREATED

        System.out.println("Enter student name:");
        s.setSname(sc.nextLine());

        System.out.println("Enter student ID:");
        s.setSid(sc.nextInt());

        System.out.println("Enter student marks:");
        s.setSmarks(sc.nextInt());

        System.out.println("\nStudent Details:");
        s.display();
    }
}

