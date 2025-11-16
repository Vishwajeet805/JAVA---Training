package MethodOveriding;

class Employee{
    int salary=40000;
    void CalculateSalary(){
        System.out.println("Salary :"+ salary);
    }
}
class Manager extends Employee{
    void CalculateSalary(int bonus){
        System.out.println("Salary :"+(salary+bonus));
    }
}
public class Ques6 {
    static void main() {
        Manager A = new Manager();
        A.CalculateSalary(5000);
    }
}
