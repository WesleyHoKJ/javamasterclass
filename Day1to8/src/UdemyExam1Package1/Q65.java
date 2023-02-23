package UdemyExam1Package1;

import java.time.LocalDate;
 
public class Q65 {
     public static void main(String [] args) {
         LocalDate date = LocalDate.parse("1980-03-16");
         System.out.println(date.minusYears(-5));
     }
}