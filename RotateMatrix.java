package MultiDimensionArray;

import java.util.Scanner;

public class RotateMatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

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
    static void reverseArray(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void rotateMatrix(int[][] matrix ,  int n){
        // transpose
        transposeInPlace(matrix , n , n);

        // reverse each row of transposed matrix
        for(int i = 0; i < n; i++){
            reverseArray(matrix[i]);
            /*
            1, 2, 3
            4, 5, 6
            7, 8, 9

            i=0
            reverseArray({1,2,3})

             */
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of matrix");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int totalElements = rows * cols;
        System.out.println("Enter " + totalElements + " values");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("Input Matrix ");
        printMatrix(matrix);
        rotateMatrix(matrix ,rows );
        System.out.println("Rotation of matrix ");
        printMatrix(matrix);
    }
}
