public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        d1l1();
        d2l1();
        d2a1();
    }

    private static void d1l1() {
        System.out.println("Day 1, Lesson 1");
        Day1Assignment day1Assignment = new Day1Assignment();
        day1Assignment.lesson1();
    }


    private static void d2l1() {
        System.out.println("Day 2, Lesson 1");
        Day2Assignment day2Assignment = new Day2Assignment();
        day2Assignment.lesson1();
    }

    private static void d2a1() {
        System.out.println("Day 2, Ancillary 1");
        Day2RegexExample day2RegexExample = new Day2RegexExample();
        day2RegexExample.pattern();
    }
}
