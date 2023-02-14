package QuizExamples;

import java.nio.file.Path;

public class IOQuiz {
    public static void main(String[] args) {
        var path1 = Path.of("a.txt");
        var path2 = Path.of("b/c.txt");
        System.out.println("Output: ..\\..\\a.txt");
        System.out.println("A.   " + path1.relativize(path2));
        System.out.println("B.   " + path2.relativize(path1));
        // System.out.println(path2.normalize(path1));
        // System.out.println(path1.normalize(path2));
    }
}
