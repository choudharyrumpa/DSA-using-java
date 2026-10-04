import java.util.Scanner;
import java.util.Arrays;
public class Question {
    static int[] SmallestAndLargestElement(int[] arr) {
//        Arrays.sort(arr);
//        int[] ans = {arr[0], arr[arr.length - 1]};
//        return ans;
//    }
        // we use both to find the smallest and largest number
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return  new int[] {min,max};
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
       int[] ans = SmallestAndLargestElement(arr);
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);

    }
}
