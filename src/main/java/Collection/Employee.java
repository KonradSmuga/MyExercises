package Collection;

public class Employee {
    private String firstName;
    private String lastName;
    private String peselId;

    public Employee(String name, String surname, String peselId) {
        this.firstName = name;
        this.lastName = surname;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o){
        final Employee e = (Employee) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId);
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(peselId.substring(0, 5));
    }

    public String toString(){
        return firstName + " " + lastName + " (" + peselId + ")";
    }


}



