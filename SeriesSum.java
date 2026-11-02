import java.util.Scanner;

public class SeriesSum {
    static int  PrintSeriesSum(int n){
        if(n==0){
           return 0;
        }
         return PrintSeriesSum(n-1) +n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(PrintSeriesSum(n));
    }
}

