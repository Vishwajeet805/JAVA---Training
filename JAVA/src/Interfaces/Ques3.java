package Interfaces;
interface Animal{
    void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Ques3Main {
    static void main() {
        Dog kutta =new Dog();
        kutta.makeSound();
    }
}
