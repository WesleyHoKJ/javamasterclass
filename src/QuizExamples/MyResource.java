package QuizExamples;

import java.io.IOException;

public class MyResource implements AutoCloseable {
    public void open() throws IOException {
         throw new IOException("open");
     }
     public void close() {
         throw new ArithmeticException("close");
     }

     
     public class Test {
        public static void main(String[] args) throws IOException {
            try (MyResource myResource = new MyResource()) {
                myResource.open();
                throw new NullPointerException("try");
            }
        }
    }
 }


