public class ShallowCopyArray {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void ChangeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
        static void changeVal(int a){
            a = 1004;

    }
    public static void main(String[] args) {
        int a= 5;
        changeVal(a);
        System.out.println(a); //5
        int[] arr=new int[3];
        arr[0]=23;
        arr[1]=34;
        arr[2]=55;
        ChangeArray(arr);
        PrintArray(arr);
    }
}
