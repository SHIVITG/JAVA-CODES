

package employee;
public class Employee {


     String name;
     String no;
     String hireDate;


    public Employee (String name, String no, String hireDate) {
        this.hireDate = hireDate;
        this.no = no;
        this.name = name;

    }
    @Override
    public String toString() {
        return "Employee Data:\nName: "+ getName() + "\nno: " + getno() + "\nHire Date: " + getHireDate() + "\n";
    }


    public String getName() {
        return name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getno() {
        return no;
    }


}
