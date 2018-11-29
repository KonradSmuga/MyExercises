package Collection;

public class SalaryParameters {

    private Double baseSalary;
    private Double regulatedBonus;
    private Double chefBonus;
    private Double functionAddSalary;

    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Double getRegulatedBonus() {
        return regulatedBonus;
    }

    public Double getChefBonus() {
        return chefBonus;
    }

    public Double getFunctionAddSalary() {
        return functionAddSalary;
    }

    public String toString() {
        return baseSalary + " + " + regulatedBonus + " + " +
                chefBonus + " + " + functionAddSalary;
    }
}


