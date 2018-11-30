import StudentNotes.Student;

public class Test {

    public static void main(String[] args) throws java.lang.Exception {

    Student student = new Student("Konrad", "Smuga", 901119134);
    Student student1 = new Student("Konrad", "Smuga", 901119134);
    Student student2 = new Student("Konrad", "Smuga", 901119134);
    Integer a = new Integer(12);
    Integer b = new Integer(12);
    Integer c =a;
    Integer d = 16;

        System.out.println("a==b?" + (a==b));
        System.out.println(a.equals(b));
}

    }


