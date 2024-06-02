import java.util.ArrayList;

public class student {

    public String FirstName;
    public String LastName;
    public int IndexNumber;
    public String email;
    public String adres;
    public ArrayList<Double> grades;

    public double calculateAverage(){
        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException("Student musi mieć jedną ocenę");
        }
        if (grades.size() > 20) {
            throw new IllegalArgumentException("Student moze miec maksymalnie 20 ocen");
        }

        double avg = 0;
        for (int i = 0; i < grades.size(); i++) {
            avg += grades.get(i);
        }

        double average = avg / grades.size();
        return java.lang.Math.round(average * 100.0) / 100.0;
    }
}