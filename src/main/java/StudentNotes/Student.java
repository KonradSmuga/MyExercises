package StudentNotes;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int peselId;

    public Student(String name, String surname, int peselId) {
        this.name = name;
        this.surname = surname;
        this.peselId = peselId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return peselId == student.peselId &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, peselId);
    }

    @Override
    public String toString() {
        return
                name + '\'' +
                surname + '\'' +
                 + peselId;
    }
}
