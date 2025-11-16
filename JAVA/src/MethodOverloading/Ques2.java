package MethodOverloading;

public class Ques2 {
    void Area(double r){
        System.out.println("Area of Circle="+(3.14*r*r));
    }
    void Area(int s){
        System.out.println("Area of Square="+(s*s));
    }
    void Area(double a,double b){
        System.out.println("Area of Triangle="+(0.5*a*b));
    }
    void Area(int a,int b){
        System.out.println("Area of Rectangle="+(a*b));
    }

    static void main() {
        Ques2 area=new Ques2();
        area.Area(2);
        area.Area(34.5);
        area.Area(3,5);
        area.Area(3.6,5.2);
    }
}
