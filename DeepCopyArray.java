import java.util.Arrays;
import java.util.Scanner;

public class DeepCopyArray {

    static void PrintArray(int[] arr){
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + "element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("original array");
        PrintArray(arr);
        // trying to copy arr to arr_2
//        int[] arr_2 = arr.clone();
        int[] arr_2 = Arrays.copyOf(arr, arr.length);
        System.out.println(("Copied array"));
        PrintArray(arr_2);

        // changing some values of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("Original array after changing arr_2");
        PrintArray(arr);
        System.out.println("copied arr_2 after changing arr_2");
        PrintArray(arr_2);


    }
}
