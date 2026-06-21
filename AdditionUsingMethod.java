import java.util.Scanner;
class Algebra{
    Algebra(){  // this is constructure
        System.out.println("Constructor of algebra class called");
    }
    int add (int a, int b){
        int add = a+b;
        return add;
    }
}
public class AddTwoNumber {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of input numbers is: ");
        int ans = obj.add(x, y);
        System.out.println(ans);
    }
}
