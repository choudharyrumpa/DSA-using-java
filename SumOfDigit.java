package Recursion;

import java.util.Scanner;

public class SumOfDigit {

    static int SumOfDigit(int n){
        // base case
        if(n>=0 && n<=9){
            return n;
        }
//        // Recursive work
//        int SmallAns=SumOfDigit(n/10);
//
//        // Self Work
//        return SmallAns + n%10;

        return SumOfDigit(n/10)  + n%10;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOfDigit(n));
    }
}
