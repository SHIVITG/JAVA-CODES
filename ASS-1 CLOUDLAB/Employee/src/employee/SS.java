

package employee;
public class SS {
public static void main (String args[]) {   
        ShiftSupervisor KO = new ShiftSupervisor("SHIVANI", "0420-W", "4/20/2015");
        ShiftSupervisor MD = new ShiftSupervisor("ABHA", "4322-W", "5/43/2015", 1000.00, 5.00);
        KO.setAnnualProductionBouns(50000000.0);
        KO.setAnnualSalary(69000000.00);
        System.out.println(KO.toString());
        System.out.println(MD.toString());
    }
}    

