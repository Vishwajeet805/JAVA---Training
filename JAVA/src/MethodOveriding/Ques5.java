package MethodOveriding;

class Vehicle{
    void StartEngine(){};
}
class Car extends Vehicle{
    void StartEngine(){
        System.out.println("Car Engine is Started.");
    }
}
public class Ques5 {
    static void main() {
        Car A = new Car();
        A.StartEngine();
    }
}
