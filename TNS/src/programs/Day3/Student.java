package programs.Day3;

public class Student {
    private int sid;
    private String sname;
    private int smarks;

    // Setter methods
    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSmarks(int smarks) {
        this.smarks = smarks;
    }

    // Getter methods
    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getSmarks() {
        return smarks;
    }

    // Display method
    public void display() {
        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Student Marks: " + smarks);
    }
}
