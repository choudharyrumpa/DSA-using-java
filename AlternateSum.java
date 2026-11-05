import java.util.Scanner;

public class AlternateSum {
    static int AlternateSum(int n){
        if(n==0){ // base case 
            return 0;
        }
        if(n % 2 ==0){
            return AlternateSum(n-1) - n;
        }
        else{
            return AlternateSum(n-1) + n;
        }
    }
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(AlternateSum(n));
    }
}
