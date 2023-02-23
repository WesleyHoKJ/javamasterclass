package ExamQuizExamples.QuizzD4_13;

public class Q18 {
    public static void main(String[] args) {
        Q18 obj = new Q18();
        obj.start();
    }

    void start(){
        String stra = "do";
        String strb = method(stra);
        System.out.println(" : " + stra + strb);
    }

    String method(String stra){
        stra = stra + "good";
        System.out.print(stra);
        return "good";
    }
}
