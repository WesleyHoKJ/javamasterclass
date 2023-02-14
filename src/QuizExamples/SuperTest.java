package QuizExamples;

class SuperTest {
    public Object myMethod(Object args) {
         // A valid body
     }
 }

    class Test extends SuperTest {
        // Method 1
     public Object myMethod(String args) {
         // A valid body
     }

        // Method 2
        public Object myMethod(Integer[] args) {
            // A valid body
        }

        // Method 3
        public Object myMethod(Object arg) {
            // A valid body
        }

        // Method 4
        public String myMethod(Object[] args) {
            // A valid body
        }
}
