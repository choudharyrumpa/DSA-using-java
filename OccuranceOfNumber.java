import java.util.Scanner;
public class OccuranceOfX {
    static int  countOccurances(int[] arr , int x) {
        int count = 0;
        for(int i= 0; i< arr.length; i++){
            if(arr[i] > x){  // count the number of elements strictly
                // greater than x the condition will be if(arr[i]>x)
                count++;
            }
        }
        return count;
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.println("Enter the elements of the array : ");
    for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter x");
    int x = sc.nextInt();
        System.out.println("count of x : " +  countOccurances(arr , x));
    }

}
