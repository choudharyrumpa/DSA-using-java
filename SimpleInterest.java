import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount");
        float principle = sc.nextFloat();

        System.out.println("Enter interest rate");
        float interestRate = sc.nextFloat();

        System.out.println("Enter yearly interest rate");
        float yearlyInterestRate = sc.nextFloat();

        float si =( principle + interestRate + yearlyInterestRate)/100;
        System.out.println("principle"+principle);
        System.out.println("interest rate"+interestRate);
        System.out.println("time"+yearlyInterestRate);
        System.out.println("The simple interest is: " + si);

    }
}
