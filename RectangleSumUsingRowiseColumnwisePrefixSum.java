package MultiDimensionArray;

import java.util.Scanner;

public class RetangleSumUsingRowiseColumnwisePrefixSum {
    static void PrefixSum(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;

        //Traverse horizontally to calculate row-wise prefix sum
        for(int i=0;i<row;i++){
            for(int j=1;j<col;j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        //traverse vertically to calculate column-wise prefix sum
        for(int j=0;j<col;j++){
            for(int i=1;i<row;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    static int RectangleSum(int matrix[][],int l1,int r1,int l2,int r2){
        PrefixSum(matrix);
        int ans=0 ,sum=0 ,up=0 ,left=0 ,leftUp=0;
        sum+=matrix[l2][r2];
        if(r1>=1){
            left=matrix[l2][r1-1];
        }
        if(l1>=1){
            up=matrix[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
            leftUp=matrix[l1-1][r1-1];
        }
        ans = sum - up - left + leftUp;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix:");
        int r  = sc.nextInt();
        int c  = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values");
        for(int i = 0; i< r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum " + RectangleSum(matrix, l1, r1, l2, r2));
    }
}
