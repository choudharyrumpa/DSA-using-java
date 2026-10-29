import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        // Divide diamond in two pyramid

        // upper pyramid
        for(int i=1; i<=r; i++){
            for(int j=1; j<=(r-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                    System.out.print("*");
            }
            System.out.println();
        }

        // lower pyramid
        for(int i= r;i>=1; i--){
            for(int j=1;j<=(r-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
