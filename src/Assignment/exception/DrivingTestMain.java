package Assignment.exception;

import java.util.Scanner;

import static Assignment.exception.DrivingTest.validateAge;

public class DrivingTestMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age for the driving license test: ");
        int age = scanner.nextInt();
        scanner.close();

        try {
            validateAge(age);
            System.out.println("Congratulations! You are eligible to take the driving test.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
