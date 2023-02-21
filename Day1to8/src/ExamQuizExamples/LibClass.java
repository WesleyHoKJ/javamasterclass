package ExamQuizExamples;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.PrivilegedAction;

public class LibClass {
    transient boolean flag = false;
private static final String FILESEPARATOR = "file.separator";

    public static String getPropValue() {
        // return AccessController.doPrivileged(new PrivilegedAction<String>() {
        //     public String run() {
        //         return System.getProperty(FILESEPARATOR);
        //     }
        // });
        return "String";
    }

    public static void main(String args[]) throws Exception {
try (var ois = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("hello.txt")))) {
ois.writeObject("Hello");
}
System.out.println(getPropValue());
    }
}