package homework.hw11;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int column = scanner.nextInt();
        System.out.println();

        System.out.println("Original matrix:");
        int[][] matrix = createMatrix(row, column);
        printMatrix(matrix);
        System.out.println();

        System.out.println("Transposed matrix:");
        int[][] transposedMatrix = transposeMatrix(matrix);
        printMatrix(transposedMatrix);
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int position : row) {
                System.out.print(position + "  ");
            }
        }
    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(30);
            }
        }
        return matrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}