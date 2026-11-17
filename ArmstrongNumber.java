import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num; // for compairig two numbers we intialize it first.
        int temp = num;
        int sum = 0;
        int digit = 0;

        // Count digits
        while(temp>0){
            temp =  temp/10;
            digit++;
        }
        temp  = num; // reassign the value of temp because temp becomes 0

        // Calculate Armstrong sum
        while(temp>0){
            int rem = temp % 10;
            sum += (int)Math.pow(rem,digit);
            temp = temp / 10;
        }
        
        if(original==sum){
            System.out.println( num + " is an Armstrong Number");
        }
        else{
            System.out.println( num + " is Not an Armstrong Number");
        }

    }
}
