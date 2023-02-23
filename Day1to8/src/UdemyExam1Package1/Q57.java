package UdemyExam1Package1;

class Vehicle {
    public int getRegistrationNumber() {
        return 1;
    }
}

class Car {
    public int getRegistrationNumber() {
        return 2;
    }
}

public class Q57 {
    public static void main(String[] args) {
        Vehicle obj = new Car();
        System.out.println(obj.getRegistrationNumber());
    }
}
