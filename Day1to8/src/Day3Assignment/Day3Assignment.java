package Day3Assignment;
public class Day3Assignment {
    private String name;
    private int age;
    private int rollNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}


class Animal {
    protected String name;
    protected String sound;

    public void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    public Dog() {
        name = "Dog";
        sound = "Bark";
    }
    
    @Override
    public void makeSound() {
        System.out.println(sound);
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}

abstract class Shape {
    abstract void calculateArea();
 }
 
 class Rectangle extends Shape {
    private int length;
    private int breadth;
 
    Rectangle(int length, int breadth) {
       this.length = length;
       this.breadth = breadth;
    }
 
    @Override
    void calculateArea() {
       System.out.println("Area of Rectangle: " + (length * breadth));
    }
 }
 
 class Circle extends Shape {
    private int radius;
 
    Circle(int radius) {
       this.radius = radius;
    }
 
    @Override
    void calculateArea() {
       System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
 }


 interface Drawable {
    void draw();
}

class DrawRectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class DrawCircle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}


class DrawRectangleImpl extends Rectangle implements Drawable {
    DrawRectangleImpl(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class DrawCircleImpl extends Circle implements Drawable {
    DrawCircleImpl(int radius) {
        super(radius);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}



 
