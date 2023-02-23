package UdemyExam1Package1;

abstract class Helper {
    int num = 100;
    String operation = null;
    
    protected abstract void help();
    
    void log() {
        System.out.println("Helper-log");
    }
}
 
public class Q8 extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";
    
    protected void help() {
        System.out.println("LogHelper-help");
    }
    
    void log() {
        System.out.println("LogHelper-log");
    }
    
    public static void main(String [] args) {
        new Q8().help();
    }
}

