import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix element :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j]=sc.nextInt();
            }    
        }
        System.out.println("Matrix :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
                }
    }
}
