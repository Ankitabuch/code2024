package Assignment.Array;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        double sum = 0;

        for (int num : arr) {
            sum += num;
        }
        System.out.print("sum of the Array: "+sum);
    }
}
