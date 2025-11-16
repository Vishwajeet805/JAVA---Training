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
class MethodOveriding {
    static void main() {
      dog a=new dog();
        a.eat();
    }
}