package MethodOveriding;


class animal{
    void eat(){
        System.out.println("burger");
    }
}
class dog extends animal {
    void eat(){
        System.out.println("dog_food");
    }
}
public class Ques1 {
    static void main() {
        animal a = new dog();
        a.eat();
    }
}
