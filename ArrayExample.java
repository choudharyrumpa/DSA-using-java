class ArrayExample{
    void multiArray() {
        int[][] arr = {{56, 43, 45}, {34, 32, 65}};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);

            }
        }


//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);
//        System.out.println(arr[2][0]);
//        System.out.println(arr[2][1]);
    }
    void demoArraay(){
        int [] ages =new int [3];
        float[] weights =new float[3];
        String[] names ={"sita","raj","aradhya"};

        ages[0]=10;
        ages[1]=20;
        ages[2]=30;
        //ages[3]=40;

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
        for(int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
       // System.out.println(ages[3]);  // out of bounds error
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(ages.length);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
//        obj.demoArraay();
        obj.multiArray();
    }
}
