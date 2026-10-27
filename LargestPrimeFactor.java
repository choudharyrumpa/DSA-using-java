import java.util.Scanner;
public class LargestPrimeFactor {
    static int LargestPrimeFactor(int n){
        int largestFactor = -1;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                largestFactor=i;
                n=n/i;
            }
        }
        if(n>1){
           largestFactor=n ;

        }
        return largestFactor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(LargestPrimeFactor(n));
    }
}
