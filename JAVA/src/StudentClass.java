class Student {
    String name;
    int rollNumber;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}
public class StudentClass{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Shruti";
        s1.rollNumber=313;
        s1.marks=7.5;
        s1.display();
        Student s2=new Student();
        s2.name="Shourya";
        s2.rollNumber=301;
        s2.marks=6.9;
        s2.display();
        Student s3=new Student();
        s3.name="Vishwajeet";
        s3.rollNumber=378;
        s3.marks=7.5;
        s3.display();
    }
}