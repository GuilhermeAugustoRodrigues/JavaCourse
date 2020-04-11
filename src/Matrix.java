import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type an integer to be the matrix order:");
        int matrixOrder = in.nextInt();

        int matrix[][] = new int[matrixOrder][matrixOrder];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Type an integer for the position "+ i +", "+ j +" of the matrix:");
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Generated matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ' ');
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        int negativeCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0){
                    negativeCounter++;
                }
            }
        }
        System.out.println("Negative number in the matrix: "+ negativeCounter);
        System.out.println("----------------------------------------");

        System.out.println("Main diagonal:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i]);
            System.out.print(" ");
        }
        System.out.println("\n----------------------------------------");
    }
}
