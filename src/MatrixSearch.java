import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type an integer to be the matrix height:");
        int matrixHeight = in.nextInt();
        System.out.println("Type an integer to be the matrix width:");
        int matrixWidth = in.nextInt();

        int[][] matrix = new int[matrixHeight][matrixWidth];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.println("Type an integer for the position "+ i +", "+ j +" of the matrix:");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Type a number to be searched for:");
        int numberToFind = in.nextInt();

        int appearanceCounter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j] == numberToFind) {
                    appearanceCounter++;
                    System.out.println(appearanceCounter + "º appearance:" +
                                       "\nPosition:" + i + ", " + j);
                    if (i > 0) {
                        System.out.println("Top number: " + matrix[i-1][j]);
                    }
                    if (i < matrix.length) {
                        System.out.println("Down number: " + matrix[i+1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Left number: " + matrix[i][j-1]);
                    }
                    if (j < matrix[i].length-1) {
                        System.out.println("Right number: " + matrix[i][j+1]);
                    }
                }
            }
        }

        in.close();
    }
}
