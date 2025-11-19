package Abstraction;

abstract class Payment {
    abstract void pay(int a);
    void succes(){
        System.out.println("payment done");
    }
}
class UpiPayment extends Payment {
    void pay(int a){
        System.out.println("pay via Upi " + a);
    }
}
class NetBanking extends Payment {
    void pay(int b){
        System.out.println("pay via netbanking " + b);
    }
}
class Hello {
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.pay(25000);
        obj.succes();
        Payment obj1 = new NetBanking();
        obj1.pay(510000);
        obj1.succes();
    }
}
