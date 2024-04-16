package April13;
import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int column = scanner.nextInt();
        int rows1 = scanner.nextInt();
        int column1 = scanner.nextInt();

        int[][] arr = new int[rows][column];
        int[][] arr1= new int[rows1][column1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                arr1[i][j] = scanner.nextInt();
            }
        }


    }
}
