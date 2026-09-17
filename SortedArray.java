import java.util.Scanner;
public class SortedArray {
    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i= 1; i< arr.length; i++){
            /*
            i = 0
            arr[0] < arr[-1]
             */
            if(arr[i]< arr[i-1]){
                // not sorted
                check = false;
                break;
        }
    }
        return check;
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
    System.out.println("Is sorted " + isSorted(arr) );

}

}
