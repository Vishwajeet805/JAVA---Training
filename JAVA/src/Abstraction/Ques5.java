package Abstraction;
abstract class Animal3 {
    abstract void sound();
}
class Dog3 extends Animal3{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat3 extends Animal3{
    void sound(){
        System.out.println("Meow");
    }
}
public class Ques5 {
    static void main() {
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
    }
}
