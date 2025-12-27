 package Miscellaneous;
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
class Kutta extends Dog{
    void bhonk(){
        System.out.println("Bhaooooooo");
    }
}
class Main{
    static void main() {
    Kutta kutta=new Kutta();
    kutta.bhonk();
    Puppy doggy=new Puppy();
    doggy.eat();
    doggy.bark();
    doggy.walk();
    }
}