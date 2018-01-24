

package employee;

public class ProductionWorker extends Employee {

    private int shift;
    private double payRate;


    
    public ProductionWorker (String name, String no, String hireDate, int shift, double payRate) {
        super(name, no, hireDate);
        this.shift = shift;
        this.payRate = payRate;

    }


    public ProductionWorker (String name, String no, String hireDate) {
        super(name, no, hireDate);

    }

    @Override
    public String toString() {
        return super.toString() + "Shift: " + getShiftName() + "\nPay Rate: $" + getPayRate() + "\n";
    }

    @Override
    public String getno() {
        return super.getno();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getHireDate() {
        return super.getHireDate();
    }

    public double getPayRate() {
        return payRate;
    }

    public int getShift() {
        return shift;
    }

    public String getShiftName () {
        if (shift == 1)
            return "day";
        else if (shift == 2)
            return "night";
        else
            return "no shift assigned";

    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
}
