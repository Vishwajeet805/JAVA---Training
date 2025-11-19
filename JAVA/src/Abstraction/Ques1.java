package Abstraction;
abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r=r;
    }
    void area(){
        System.out.println("Area :"+(3.14*r*r));
    }
}
class Rectangle extends Shape {
    int l,b;
    Rectangle(int l,int b) {
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("Area :"+(l*b));
    }
}
public class Ques1 {
    static void main() {
        Circle c=new Circle(10);
        c.area();
        Rectangle r=new Rectangle(12,4);
        r.area();

    }
}
