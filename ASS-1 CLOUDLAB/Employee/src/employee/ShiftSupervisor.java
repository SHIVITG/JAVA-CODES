

package employee;
public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualProductionBouns;
    public ShiftSupervisor (String name, String no, String hireDate) {
        super(name, no, hireDate);
        this.annualSalary = -1.0;
        this.annualProductionBouns = -1.0;
    }
    public ShiftSupervisor (String name, String no, String hireDate, double annualSalary, double annualProductionBouns) {
        super(name, no, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBouns = annualProductionBouns;
    }
    @Override
    public String toString() {
        return super.toString() + "Annual Salary: $" + getAnnualSalary() + "\nAnnual Production Bonus: $" + getAnnualProductionBouns() + "\n";
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getno() {
        return super.getno();
    }
    @Override
    public String getHireDate() {
        return super.getHireDate();
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public double getAnnualProductionBouns() {
        return annualProductionBouns;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public void setAnnualProductionBouns(double annualProductionBouns) {
        this.annualProductionBouns = annualProductionBouns;
    }
}