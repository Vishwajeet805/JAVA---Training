package Interfaces;
interface  Walkable {
    void walk();
}
interface Runnable{
    void run();
}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("Can Walk");
    }
    public void run(){
        System.out.println("Can Run");
    }
}
class Ques1Main {
    static void main() {
    Human manav=new Human();
    manav.run();
    manav.walk();
    }
}
