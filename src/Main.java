import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        student st= new student();
        st.FirstName = "szymon ";
        st.LastName = "kesik";
        st.adres = "dluga 100";
        st.IndexNumber = 37;
        st.email = "szymon@pgo.pl";
        st.grades = new ArrayList<>();
        st.grades.add(3.5);
        st.grades.add(4.0);
        st.grades.add(3.0);
        st.grades.add(3.0);
        st.grades.add(5.0);
        try {
            double srednia = st.calculateAverage();
            System.out.println("średnia = " + srednia);
        }catch(IllegalArgumentException e){
            System.out.println("Błąd: " + e.getMessage());
        }
        GrupaStudent grupa = new GrupaStudent();
        try {
            grupa.addStudent("janek andrzejewski");
            grupa.addStudent("andrzej nowak");
            grupa.addStudent("marek jarosz");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

    }
}