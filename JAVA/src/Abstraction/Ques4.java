package Abstraction;
abstract class Animal2 {
    abstract void sound();
}
class Dog2 extends Animal2{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat2 extends Animal2{
    void sound(){
        System.out.println("Meow");
    }
}
public class Ques4 {
    static void main() {
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
    }
}
