package ExamQuizExamples;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DomainLocalization {
    public static void main(String[] args) {
        double d = 1234567.890;
        NumberFormat f2 = new DecimalFormat("$###,###,000.00000");
        System.out.println(f2.format(d));
    }

// A. Does not compile
// B. Throws exception
// C. Prints $001,234,567.89000
// D. Prints $1,234,567.89
// E. Prints a different result

}
