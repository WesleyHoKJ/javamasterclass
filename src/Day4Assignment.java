import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day4Assignment {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        
        // ArrayIndexOutOfBoundsException
        try {
          numbers[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("ArrayIndexOutOfBoundsException: Index 5 is out of bounds for length 5");
        }
    
        // NullPointerException
        try {
          String str = null;
          System.out.println(str.length());
        } catch (NullPointerException e) {
          System.out.println("NullPointerException: str is null");
        }
    
        // ArithmeticException
        try {
          int num1 = 10;
          int num2 = 0;
          System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
          System.out.println("ArithmeticException: Divide by zero");
        }
    
        // ClassCastException
        try {
          Object obj = new Integer(10);
          System.out.println((String) obj);
        } catch (ClassCastException e) {
          System.out.println("ClassCastException: Cannot cast Integer to String");
        }
    
        // FileNotFoundException
        try {
          File file = new File("file.txt");
          FileReader fileReader = new FileReader(file);
          fileReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("FileNotFoundException: file.txt not found");
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    
        // IOException
        try {
          File file = new File("file.txt");
          try (FileReader fileReader = new FileReader(file)) {
            fileReader.read();
          }
        } catch (FileNotFoundException e) {
          System.out.println("FileNotFoundException: file.txt not found");
        } catch (IOException e) {
          System.out.println("IOException: Error reading from file");
        }
      }  
}
