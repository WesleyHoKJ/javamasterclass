import java.util.Scanner;

public class Fibonacci {

    private static int choice;
    private static int f0;
    private static int f1;
    private static int fib;
    static Scanner sc = new Scanner(System.in);

    public Fibonacci() {
        fib = 0;
        f0 = 0;
        f1 = 1;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("What is the Nth value for the Fibonacci series:");
        choice = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i < choice; i++) {
            fib = f0 + f1;
            System.out.printf("item %s => %s \n", i, fib);
            f0 = f1;
            f1 = fib;
        }

    }
}
