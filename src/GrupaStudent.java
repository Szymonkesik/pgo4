import java.util.ArrayList;
public class GrupaStudent {
    public String nazwa;
    public ArrayList<String> students;
    public static final int MAX_SIZE = 15;
    public GrupaStudent() {
        this.students = new ArrayList<>();
    }
    public void addStudent(String student) {
        if (students.size() >= MAX_SIZE) {
            throw new IllegalStateException("Grupa studentow jest pelna, maksymlana liczba studentow w grupie to: " + MAX_SIZE + ".");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student " + student + "jest już w grupie");
        }
        students.add(student);
    }
}