package Collection;

import java.util.HashMap;
import java.util.Map;

class HashMapAndLoopTest
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Employee worker1 = new Employee("Zachary", "Taylor", "12345678901");
        Employee worker2 = new Employee("Monica", "Kowalski", "12345612345");
        Employee worker3 = new Employee("Robert", "Greenwood", "12345698765");
        Employee worker4 = new Employee("Robert", "Greenwood", "12345045678");

        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);
        SalaryParameters params4 = new SalaryParameters(11000.0, 0.0, 2000.0, 1000.0);

        HashMap<Employee, SalaryParameters> salariesParameters = new HashMap<Employee, SalaryParameters>();

        salariesParameters.put(worker1, params1);
        salariesParameters.put(worker2, params2);
        salariesParameters.put(worker3, params3);
        salariesParameters.put(worker4, params4);

        for(Map.Entry<Employee, SalaryParameters> entry : salariesParameters.entrySet()) {
            if (entry.getValue().getBaseSalary() >= 5000){
                System.out.println("Salary of " + entry.getKey() + " equals " +
                        entry.getValue());
            }
        }
    }
}
