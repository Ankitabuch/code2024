package Assignment.Array;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 43, 54, 23, 543, 43, 32};
        double sum=0;

        for(int num: arr){
            sum += num;
        }

        double average = sum / arr.length;

        System.out.println("Average of the Array: "+ average);

    }
}
