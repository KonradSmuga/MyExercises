
import StudentNotes.Grades;
import StudentNotes.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static Fibonacci.Fibonacci.fibonacci;
//1.	Przy użyciu wewnętrznego edytora Kodilli stwórz program z użyciem HashMap, który będzie przechowywał dane uczniów oraz ich ocen.
//2.	Program ma wyświetlać średnią arytmetyczną ocen każdego ucznia.
//3.	Rozwiązane zadanie wyślij do mentora.

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Student konrad = new Student("Konrad", "Smuga", 900123);
        Student david = new Student("David", "Kowalski", 980248);
        Student katia = new Student("Katia", "Drewno", 902349596);


        Grades math = new Grades("Matematyka", new ArrayList(Arrays.asList(3.0, 5.0, 6.0)));
        Grades math1 = new Grades("Matematyka", new ArrayList(Arrays.asList(4.0, 2.0, 3.0)));
        HashMap<Student, Grades> notesParameters = new HashMap<>();


        notesParameters.put(konrad, math);
        for(Map.Entry<Student, Grades> entry :notesParameters.entrySet()) {
            System.out.println("Average grades of student: " + entry.getKey() + ""+ entry.getValue()+ "is average: "
                    + entry.getValue().countAverage());
        }

        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
}