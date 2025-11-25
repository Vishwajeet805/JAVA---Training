package Interfaces;
interface Vehicle {
    default void start(){
        System.out.println("Vehicle is starting.");
    }
}
class Car implements Vehicle{

}
class Ques5Main {
    static void main() {
    Car BMW=new Car();
    BMW.start();
    }
}
