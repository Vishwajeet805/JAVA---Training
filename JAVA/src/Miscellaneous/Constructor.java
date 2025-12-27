//class Car4{
//    int a;
//    Car4(int a){
//        this.a=a;
//        System.out.println(a);
//    }
//    Car4(){
//        System.out.println("HELOO");
//    }
//    Car4(String str){
//        System.out.println(str);
//    }
//
//    static void main() {
//        Car4 obj1=new Car4("hllo");
//        Car4 obj=new Car4();
//        Car4 obj2=new Car4(40);
//
//
//}
 package Miscellaneous;
class Hello{
    public Hello(){
        this(5);
        System.out.println("Hiii");
    }
    public Hello(int a){
        this(5,7);
        System.out.println(a);
        System.out.println("hii");
    }
    public Hello(int a,int b){
        System.out.println(a+b);
        System.out.println("hII");
    }


}
class men{

        static void main() {
            Hello obj=new Hello();
//        Hello ovj=new Hello(6);
//        Hello onj=new Hello(8,5);

        }
    }
