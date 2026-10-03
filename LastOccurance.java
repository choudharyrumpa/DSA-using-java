import java.util.Scanner;

public class LastOccurances {
    static int  LastOccurancesOfX(int[] arr , int x) {
        int LastIndex = -1;
        for(int i= 0; i< arr.length; i++){
            if(arr[i] == x){
               LastIndex = i;
            }
        }
        return LastIndex;
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
        System.out.println("LastOccurance of  x : " +  LastOccurancesOfX(arr , x));
    }

}

