package Interfaces;
interface A1{
    void login();
    default void failed(){
        System.out.println("Login Failed");
    }
}
interface C1{
    void signin();
}
class B1 implements A1,C1{
    public void login() {
        System.out.println("hello");
    }

    public void signin() {
        System.out.println("Sign");
    }

}
class InterfacesMain {
    static void main(String[] args) {
        B1 b1=new B1();
        b1.login();
        b1.signin();
        b1.failed();
    }
}
