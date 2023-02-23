package UdemyExam1Package1;

import java.time.LocalDate;
 
public class Q64 {
     public static void main(String [] args) {
         LocalDate d1 = LocalDate.parse("1999-09-09");
         LocalDate d2 = LocalDate.parse("1999-09-09");
         LocalDate d3 = LocalDate.of(1999, 9, 9);
         LocalDate d4 = LocalDate.of(1999, 9, 9);
         System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
     }
}
