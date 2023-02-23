package UdemyExam1Package1;
import java.util.ArrayList;
import java.util.List;
 
public class q48 {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("ONE");
         list.add("TWO");
         list.add("THREE");
         list.add("THREE");
 
         if(list.remove(2)) {
             list.remove("THREE");
         }
 
         System.out.println(list);
    }
}
