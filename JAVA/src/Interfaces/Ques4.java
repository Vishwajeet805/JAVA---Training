package Interfaces;
interface Shape{
    void Area();
}
class Circle implements Shape{
    int r;
    Circle(int r){
        this.r =r;
    }
    public void Area(){
        System.out.println("Area : "+3.14*r*r);
    }
}
 class Ques4Main {
    static void main() {
        Circle c1=new Circle(5);
        c1.Area();
    }
}
