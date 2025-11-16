package MethodOverloading;
class Ques1 {
    void add(int a ,int b ){
        System.out.println(a+b);
    }
    void add(int a ,int b , int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(double a,double b, double c){
        System.out.println(a+b+c);
    }

    static void main() {
        Ques1 a=new Ques1();
        a.add(2,3);
        a.add(2,3,4);
        a.add(2.9,3.1);
        a.add(2.3,3.8,4.9);
    }
}
