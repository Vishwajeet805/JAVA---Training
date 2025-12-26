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
echo 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time) -> (0)' >> foobar.txt
git add foobar.txt
git commit --date='Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)' -m 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)'
echo 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time) -> (1)' >> foobar.txt
git add foobar.txt
git commit --date='Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)' -m 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)'
echo 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time) -> (2)' >> foobar.txt
git add foobar.txt
git commit --date='Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)' -m 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)'
echo 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time) -> (3)' >> foobar.txt
git add foobar.txt
git commit --date='Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)' -m 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)'
echo 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time) -> (4)' >> foobar.txt
git add foobar.txt
git commit --date='Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)' -m 'Sat Nov 22 2025 00:00:00 GMT+0530 (India Standard Time)'
git push 