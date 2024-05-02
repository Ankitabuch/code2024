package april30;

public class ArrayOutOfBound {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            int value = numbers[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds.");
        }

        System.out.println(numbers[0]);
    }
}
