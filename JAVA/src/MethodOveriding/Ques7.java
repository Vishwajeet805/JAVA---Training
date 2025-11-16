package MethodOveriding;

class Person{
    String name="ROHAN";
    int age=35;
    void DisplayDetails(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
    }
}
class Student extends Person{
    void DisplayDetails(char Grade,String School_Name){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
        System.out.println("Grade :"+ Grade);
        System.out.println("School :"+ School_Name);
    }
}
public class Ques7 {
    static void main() {
        Student A = new Student();
        A.DisplayDetails('A',"DPS");
    }
}
