

class Circle{
    int radius;
    void area(){
        System.out.println("Area:"+3.14*radius*radius);
    }
    void circumference(){
        System.out.println("Circumference:"+2*3.14*radius);
    }

    static void main() {
        Circle gola1=new Circle();
        gola1.radius=2;
        gola1.area();
        gola1.circumference();
        Circle gola2=new Circle();
        gola2.radius=5;
        gola2.area();
        gola2.circumference();
    }
}
