package Interfaces;
interface a {
    void display();
}
interface b{
    void display();
}
class Demo implements a,b{
    public void display(){
        System.out.println("Can Display");
    }
}
class Ques2Main {
    static void main(String[] args) {
        Demo obj= new Demo();
        obj.display();
    }
}
