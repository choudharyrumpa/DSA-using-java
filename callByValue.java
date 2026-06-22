public class CallByValue {
    static void ChangeValue( int a){
        a *= 100;
        System.out.println("Inside change value" + a);
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println("Before changeValue" + a);
        ChangeValue(a);
        System.out.println("After changeValue" + a);
    }
}
