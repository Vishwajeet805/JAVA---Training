package Inheritance;
class Employee {
    void work(){
        System.out.println("Employee is working");
    }
}
class Manager extends Employee{
    void meeting(){
        System.out.println("Manager is attending a meeting");
    }
}
 class Emloyee{
     static void main() {
         Manager m=new Manager();
         m.work();
         m.meeting();
     }
}