package Abstraction;
abstract class Animal {
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
public class Ques2 {
    static void main() {
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
    }
}
