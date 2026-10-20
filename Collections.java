package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(0);
         list.add(10);
         list.add(3);
         list.add(5);
         list.add(22);
         list.add(4);
         System.out.println("Original list: "+ list);
         Collections.reverse(list);
         System.out.println("Reverse list: " + list);
         Collections.sort(list);
         System.out.println("Ascending list: " + list);
         Collections.sort(list, Collections.reverseOrder());
         System.out.println("Descending list: " + list);

         ArrayList<String> l1 = new ArrayList<>();
         l1.add("Welcome ");
         l1.add("To ");
         l1.add("Collections ");
         l1.add("Class ");
         System.out.println("Original list: "+ l1);
         Collections.sort(l1);
         System.out.println("Ascending list: " + l1);
         Collections.sort(l1, Collections.reverseOrder());
         System.out.println("Descending list: " + l1);


    }

}
