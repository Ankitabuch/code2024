package Assignment.polymarphism;

public class Employee {
    String employeeID;
    String employeeName;

    public Employee(String employeeID,String employeeName){
        this.employeeID = employeeID;
        this.employeeName =employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double calculatePay(){
        return 0.0;
    }
}
