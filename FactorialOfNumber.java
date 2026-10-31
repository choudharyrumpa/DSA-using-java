import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        // base case
        if(n==0){
            return 1;
        }

        //smaaller problem - recursive work
        int smallAns = factorial(n-1);

        // big problem - self work
        return n * smallAns;   // n* factorial(n-1)


    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));

    }
}
