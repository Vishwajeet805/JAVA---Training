package MethodOverloading;

public class Ques3 {
    void print(String x){
        System.out.println("String"+x);
    }
    void print(int x){
        System.out.println("Square"+(x*x));
    }

    static void main() {
        Ques3 a=new Ques3();
        a.print("VISHWAJEET");
        a.print(5);
    }
}
