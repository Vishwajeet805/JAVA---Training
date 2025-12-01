package Abstraction;
abstract class Animal1 {
    abstract void sound();
}
class Dog1 extends Animal1{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat1 extends Animal1{
    void sound(){
        System.out.println("Meow");
    }
}
public class Ques3 {
    static void main() {
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();
    }
}
