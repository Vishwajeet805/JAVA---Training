class Rectangle {
    int length;
    int breadth;
    void area(){
        System.out.println("Area:"+ length*breadth);
    }
    void perimeter(){
        System.out.println("Perimeter:"+ 2*(length+breadth));
    }

}
public class AreaAndPerimeter {
    static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length=3;
        r1.breadth=5;
        r1.area();
        r1.perimeter();
        Rectangle r2= new Rectangle();
        r2.length=2;
        r2.breadth=2;
        r2.area();
        r2.perimeter();
    }
}
