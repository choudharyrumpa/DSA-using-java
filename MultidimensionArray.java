package MultiDimensionArray;

import java.util.Scanner;

public class multiDimensionArray {
    static void printAray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
       int[][] arr = new int[rows][columns];
        System.out.println("Enter " + rows * columns + " elements ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printAray(arr);
    }
}
