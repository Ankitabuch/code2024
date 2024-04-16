package April13;

public class ArraySorting {

    public static void main(String[] args){

        int[] arr = {23, 44, 23, 53, 54, 23, 87, 87};
        int l=0;
        for(int i=0; i<arr.length; i++){
            for(int k=i+1; k<arr.length; k++) {
                if (arr[i] > arr[k]) {
                    l = arr[i];
                    arr[i] = arr[k];
                    arr[k] = l;
                }
            }
            System.out.println(arr[i]);
        }
    }
}

/*for(int i=0; i<arr.lenght/2; i++){
    int t = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = t;
        }*/
