package ExamQuizExamples.QuizzD4_13;

public class Q3 {
    static void doCalc(byte... a){
        System.out.println("byte...");
    }
    static void doCalc(long a, long b){
        System.out.println("long ,long");
    }
    static void doCalc(Byte s1, Byte s2){
        System.out.println("Byte, Byte");
    }
    public static void main(String[] args){
        byte b = 5;
        doCalc(b,b);
    }
}
