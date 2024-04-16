package April13;

public class MaxArray {

    public static void main(String[] args) {

        int[] arr = {45, 67, 34, 23, 23, 89, 48};
        int max = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("maximum value of the Array: "+max);
        for(int i=1; i<arr.length; i++){
            if(min> arr[i])
                min = arr[i];
        }
        System.out.println("minimum value of the Array: "+min);
    }

}
