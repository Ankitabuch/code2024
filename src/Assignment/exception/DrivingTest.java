package Assignment.exception;

public class DrivingTest {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Invalid age! Age must be between 18 and 100 years old.");
        }
    }
}
