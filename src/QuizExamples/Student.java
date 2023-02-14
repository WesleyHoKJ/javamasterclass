package QuizExamples;

public class Student { // line 1
    public static void main(String[] args) { // line 2
     Student one = new Student(); // line 3
     Student two = one; // line 4
     Student three = two; // line 5
     one = null; // line 6
     Student four = one; // line 7
     two = null; // line 8
     three = new Student(); // line 9
     System.gc(); // line 10
    } // Line 11
  }
