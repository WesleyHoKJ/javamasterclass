package UdemyExam1Package1;

class Parent {
    public String toString() {
        return "Inner ";
    }
}

class Child extends Parent {
    public String toString() {
        return super.toString().concat("Peace!");
    }
}

public class Q20 {
    public static void main(String[] args) {
        System.out.println(new Child());
    }
}
