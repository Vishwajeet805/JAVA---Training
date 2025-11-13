class Animal{
    void eat(){
        System.out.println("Eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bark");
    }
}
class Puppy extends Dog{
    void walk(){
        System.out.println("Walk");
    }
}
class Main{
    static void main() {

    Puppy doggy=new Puppy();
    doggy.eat();
    doggy.bark();
    doggy.walk();
    }
}