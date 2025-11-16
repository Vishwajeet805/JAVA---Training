package MethodOveriding;

class Animal{
    void Sound(){
        System.out.println("Animal Makes Sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Bark");
    }
}
public class Ques2 {
    static void main() {
        Dog A = new Dog();
        A.Sound();
    }
}
