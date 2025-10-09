import java.util.Scanner;

public class SumOfTwoNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
    }
