package StudentNotes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Grades {
    private String subjectName;
    private List<Double> notes = new ArrayList<>();
    private double sum;

    public Grades(String subjectName, List<Double> notes) {
        this.subjectName = subjectName;
        this.notes = notes;
    }




    double average = 0;
    public double countAverage() {
        for(int i = 0; i <notes.size(); i++)
            sum += notes.get(i);
        average = sum / notes.size();

        return average;
    }

    @Override
    public String toString() {
        return " " +
                subjectName + '\'' +
                notes;

    }

}
