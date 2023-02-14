package QuizExamples;

import java.util.HashSet;
import java.util.Set;

public class ArraysCollections {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>(); //line 1
        colors.add("yellow"); //line 2
        colors.add("Blue"); //line 3
        colors.sort((a1, a2) -> a1.compareTo(a2)); //line 4
        System.out.println(colors);
    }

// A. Prints [yellow, Blue]
// B. Exception at runtime
// C. Prints [Blue, yellow]
// D. Compiler error at line 1
// E. Compiler error at line 4
// F. None of these
}
