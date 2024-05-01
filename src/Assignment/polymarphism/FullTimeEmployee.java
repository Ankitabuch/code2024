package Assignment.polymarphism;

public class FullTimeEmployee extends Employee{

    private double salary;

    public FullTimeEmployee(String employeeId,String employeename, double salary){
        super(employeeId,employeename);
        this.salary = salary;
    }
    @Override
    public double calculatePay() {
        return salary;
    }
}
