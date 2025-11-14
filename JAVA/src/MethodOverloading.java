
class animal{
    void eat(){
        System.out.println("burger");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("dog_food");
    }
}
class over_riding {
    public static void main(String[] args) {
        animal a = new dog();
        a.eat();
    }
}