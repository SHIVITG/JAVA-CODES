package employee;
public class TeamLeader extends ProductionWorker {
    private double monthyBonus;
    private int minTrainingHours;
    private int trainingHours;
    public TeamLeader (String name, String no, String hireDate, int shift, double payRate) {
        super(name, no, hireDate, shift, payRate);
    }
    public TeamLeader (String name, String no, String hireDate, int shift, double payRate, double monthyBonus, int minTrainingHours, int trainingHours) {
        super(name, no, hireDate, shift, payRate);
        this.monthyBonus = monthyBonus;
        this.minTrainingHours = minTrainingHours;
        this.trainingHours = trainingHours;
    }
    @Override
    public String toString() {
        return super.toString() + "Monthly Production Bonus: $" + getMonthyBonus() + "\nMin Training Hours Required: " + getMinTrainingHours() + "hr\nHours Trained: " + getTrainingHours() + "hr\n";
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
    @Override
    public double getPayRate() {
        return super.getPayRate();
    }
    @Override
    public int getShift() {
        return super.getShift();
    }
    @Override
    public String getShiftName() {
        return super.getShiftName();
    }
    public double getMonthyBonus() {
        return monthyBonus;
    }
    public int getMinTrainingHours() {
        return minTrainingHours;
    }
    public int getTrainingHours() {
        return trainingHours;
    }
    @Override
    public void setShift(int shift) {
        super.setShift(shift);
    }
    @Override
    public void setPayRate(double payRate) {
        super.setPayRate(payRate);
    }
    public void setMinTrainingHours(int minTrainingHours) {
        this.minTrainingHours = minTrainingHours;
    }
    public void setMonthyBonus(double monthyBonus) {
        this.monthyBonus = monthyBonus;
    }
    public void setTrainingHours(int trainingHours) {
        this.trainingHours = trainingHours;
    }
}