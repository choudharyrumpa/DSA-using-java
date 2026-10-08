package MultiDimensionArray;

import java.util.Scanner;

public class TransposeMatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposeMatrix(int[][] matrix , int r , int c){
        int[][] ans = new int [c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

// Transpose InPlace
    //Only used in square matrix
    static int[][] transposeInPlace(int[][] matrix , int r , int c){
        for (int i = 0; i < c; i++) {
            for(int j = i; j < r; j++){
                // swap matrix[i][j] , matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of matrix");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int totalElements = rows * cols;
        System.out.println("Enter" + totalElements + "values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Transpose of Matrix");
//        int[][] ans  = transposeMatrix(matrix, rows, cols);
//        printMatrix(ans);
        transposeInPlace(matrix, rows, cols);
        printMatrix(matrix);
    }
}

