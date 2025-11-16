package Inheritance;
class Shape {
    void Draw(){
        System.out.println("Drawing a shape");
    }
}
class Circles extends Shape{
    void CalcArea(){
        System.out.println("Calculating Area");
    }
}
class Draw{
    static void main() {
        Circles m=new Circles();
        m.Draw();
        m.CalcArea();
}
}