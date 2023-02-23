package UdemyExam1Package1;

import java.util.ArrayList;
import java.util.List;
 
public class Q44 {
     public static void main(String [] args) {
         List<Integer> list = new ArrayList<Integer>();
 
         list.add(27);
         list.add(27);
 
         list.add(new Integer(27));
         list.add(new Integer(27));
 
         System.out.println(list.get(0) == list.get(1));
         System.out.println(list.get(2) == list.get(3));
     }
}
