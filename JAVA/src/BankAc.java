class BankAccount {
    int accountNumber;
    int balance;
    String accountHolder;
    void Deposit(int x){
        balance+=x;
        System.out.println("Amount Deposited:"+x);
        System.out.println("Current Balance:"+ balance);
    }
    void Withdraw(int x){
        if(x>balance)
            System.out.println("Insufficient Balance");
        else{
            balance-=x;
            System.out.println("Amount Withdrawn:"+ x);
        System.out.println("Current Balance:"+ balance );}
    }

}
public class BankAc {
    static void main(String[] args) {
        BankAccount Acc1=new BankAccount();
        Acc1.accountHolder="SHRUTI";
        Acc1.balance=3000;
        Acc1.accountNumber=241313;
        Acc1.Deposit(1000);
        Acc1.Withdraw(5000);
        BankAccount Acc2=new BankAccount();
        Acc2.accountHolder="VISHWAJEET";
        Acc2.balance=6500;
        Acc2.accountNumber=241378;
        Acc2.Deposit(1000);
        Acc2.Withdraw(5000);
    }
}

