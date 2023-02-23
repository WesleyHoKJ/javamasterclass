package UdemyExam1Package1;

public class Q21 {

    public static void main(String[] args) {
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);
    }

}
