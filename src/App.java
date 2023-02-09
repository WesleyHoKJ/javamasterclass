public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // d1l1();
        // d2l1();
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

    public static void D3L1() {
        Day3Assignment student = new Day3Assignment();
        student.setName("John Doe");
        student.setAge(20);
        student.setRollNumber(101);
        
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
    
    // Inheritance
    public static void D3L2() {
        Animal dog = new Dog();
        dog.makeSound();
    }

    // Abstraction
    public static void D3L3() {
        final int radius = 80;
        final int length = 80;
        final int breadth = 80;

        Rectangle rectangle = new Rectangle(length,breadth);
        rectangle.calculateArea();

        Circle circle = new Circle(radius);
        circle.calculateArea();
    }
    
    // Implementations
    public static void D3L4() {
        Drawable rectangle = new DrawRectangle();
        Drawable circle = new DrawCircle();
        rectangle.draw();
        circle.draw();
    }

    // Abstraction with an Implementations
    final static int radius = 80;
    final static int length = 80;
    final static int breadth = 80;

    public static void D3L5() {
        Drawable rectangle = new DrawRectangleImpl(length, breadth);
        Drawable circle = new DrawCircleImpl(radius);
        rectangle.draw();
        circle.draw();
    }

}
