package Assignment.polymarphism;

public class EmployeeMain {
    public static void main(String[] args){

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("SS3467","Siya Saran",5000);
        System.out.println("Details of full time Employee");
        System.out.println("Name: " + fullTimeEmployee.getEmployeeName() + "\nEmployee ID: " + fullTimeEmployee.getEmployeeID());
        System.out.println("Employee Monthly Salary: $" + fullTimeEmployee.calculatePay());

        System.out.println();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("RR5674","Riya Ray",34,40);
        System.out.println("Details of Part time Employee");
        System.out.println("Name: " + partTimeEmployee.getEmployeeName() + "\nEmployee ID: " + partTimeEmployee.getEmployeeID());
        System.out.println("Employee Monthly Salary: $"+ partTimeEmployee.calculatePay());



    }
}
