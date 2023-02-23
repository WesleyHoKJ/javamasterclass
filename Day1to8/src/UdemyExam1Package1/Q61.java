package UdemyExam1Package1;

public class Q61 {
    private static boolean flag = !true;

    public static void main(String [] args) {
        System.out.println(!flag ? args[0] : args[1]);
    }
}