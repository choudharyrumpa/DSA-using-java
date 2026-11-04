import java.util.Scanner;

public class PowerOfNumber {

    static int pow1(int p, int q) { // TC= log(q)
        if(q==0)
            return 1;
        int smallAns =  pow1(p,q/2);
        if(q%2==0){ //even
            return smallAns* smallAns;
        }//odd
        return p *  smallAns * smallAns;
    }
//    static int Power(int p , int q){  // p^q Time complexity=O(q)
//        if(q==0){
//            return 1;
//        }
//        return Power(p,q-1) * p;  // p^q-1 * p = p^q
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        // System.out.println(Power(p,q));
        System.out.println(pow1(p,q));
    }
}
