package April13;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arr = {23, 44, 23, 53, 54, 23, 87, 87};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum ;
        }
        System.out.println("sum of the Array : " + sum);
    }
}
