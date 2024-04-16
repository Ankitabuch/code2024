package Assignment.Array;

public class SecondMinArray {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};

        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }
            int l=0;
            for(int i=0; i<arr.length; i++){
                for(int k=i+1; k<arr.length; k++) {
                    if (arr[i] > arr[k]) {
                        l = arr[i];
                        arr[i] = arr[k];
                        arr[k] = l;
                    }
                }
            }System.out.println("second minimum value of the Array: " +arr[1]);
        }
    }

