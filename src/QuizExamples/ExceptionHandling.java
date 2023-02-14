package QuizExamples;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
     try {
           FileReader fileReader = new FileReader("c:\\data\\input-text.txt");
           int data = fileReader.read();
       } catch (IOException | IllegalStateException ex) {
           ex = null;
      }

}
