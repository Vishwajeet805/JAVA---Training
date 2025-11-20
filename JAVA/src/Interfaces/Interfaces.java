package Interfaces;
interface a{
    void login();
    default void failed(){
        System.out.println("Login Failed");
    }
}
interface c{
    void signin();
}
class b implements a,c{
    public void login(){
        System.out.println("hello");
    }
    public void signin(){
        System.out.println("Sign");
    }

}
public class Interfaces {
    static void main() {
        b b1=new b();
        b1.login();
        b1.signin();
        b1.failed();
    }
}
