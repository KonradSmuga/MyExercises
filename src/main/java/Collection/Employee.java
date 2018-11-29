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

    public int hashCode(){
        //This method cuts first 6 (0-5) characters from peselId
        //and then converts it into Integer
        //peselId includes year and month and day of birth in the first 6 characters
        //for example: beginning of peselId 800630 means that persone having this peselId
        //was born on 30 july 1980.
        //returning value will be 800630 (Integer type)
        return Integer.parseInt(peselId.substring(0, 5));
    }

}

