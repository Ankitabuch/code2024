package Assignment.Array;

public class ArrayAdd {
    public static void main(String[] args){
        int[][] arr1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] arr2= {{2,9,40}, {5,3,6}, {3,5,12}};

        int[][] additionArray = new int[3][3];

        for (int i=0; i<arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                additionArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of the two arrays:");

        for (int i=0; i<additionArray.length; i++) {
            for (int j = 0; j < additionArray.length; j++) {
                System.out.print(additionArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
