package Collection;

import java.util.HashMap;
import java.util.Map;

class HashMapTest {
    public static void main(String[] args) throws java.lang.Exception {
        Employee worker1 = new Employee("Jennifer", "Nowak", "12345678901");
        Employee worker2 = new Employee("Sarah", "Taylor", "12345612345");
        Employee worker3 = new Employee("Laura", "Pinelli", "12345698765");
        Employee worker4 = new Employee("Laura", "Pinelli", "12345045678");

        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);
        SalaryParameters params4 = new SalaryParameters(11000.0, 0.0, 2000.0, 1000.0);

        HashMap<Employee, SalaryParameters> paymentParameters = new HashMap<>();

        paymentParameters.put(worker1, params1);
        paymentParameters.put(worker2, params2);
        paymentParameters.put(worker3, params3);
        paymentParameters.put(worker4, params4);

        System.out.println("Salary of Jennifer Nowak equals: " + paymentParameters.get(worker1));

        //Creating and filling the map
        HashMap<Integer, String> theMap = new HashMap<Integer, String>();
        theMap.put(1, "One");
        theMap.put(2, "Two");
        theMap.put(7, "Seven");

        //Using entrySet() to retrieve and display content of the map
        for (Map.Entry<Integer, String> entry : theMap.entrySet()) {
            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");



        }
    }
}

