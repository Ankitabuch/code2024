package Assignment.Array;

public class SecondMaxArray {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};

        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second maximum element: " + secondMax);
    }
}

