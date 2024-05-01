package Assignment.polymarphism;

public class PartTimeEmployee extends Employee{

    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(String employeeID, String employeeName, double hourlyRate, double hoursWorked) {
        super(employeeID, employeeName);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*hoursWorked;
    }
}


