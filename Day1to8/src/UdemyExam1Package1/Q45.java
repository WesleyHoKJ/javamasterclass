package UdemyExam1Package1;

import java.util.ArrayList;
import java.util.List;
 
public class Q45 {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         list.add(100);
         list.add(200);
         list.add(100);
         list.add(200);
         list.remove(new Integer(100));
 
         System.out.println(list);
     }
}
