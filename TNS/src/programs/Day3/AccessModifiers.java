package programs.Day3;

public class AccessModifiers {
    public static void main(String[] args) {
        Student s = new Student();
        s.setSname("Durga");
        s.setSid(109);
        s.setSmarks(954);

        s.display(); // To show student details
    }
}
