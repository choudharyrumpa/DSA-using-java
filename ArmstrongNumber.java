import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int digits = 0;
        int sum = 0;

        // Count digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
