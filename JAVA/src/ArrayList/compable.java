package ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
class Students {
    String name;
    int age;
    int Roll_number;

    public Students(String name, int age, int Roll_number) {
        this.name = name;
        this.age = age;
        this.Roll_number = Roll_number;
    }

}
class NameSorted implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class y {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Om",19,56));
        list.add(new Student("Shaurya",19,55));
        list.add(new Student("Ram",19,60));
        list.add(new Student("Vansh",19,57));
        list.add(new Student("Shanya",19,60));
        list.add(new Student("Arya",19,58));
        list.add(new Student("Siddharth",19,52));
        list.add(new Student("Vishwajeet",19,54));
        list.add(new Student("Soniya",19,50));
        list.add(new Student("Aditya",19,59));
        list.add(new Student("Aryan",19,51));
        Collections.sort(list,new NameSorted());
        for (Student s:list) {
            System.out.println(s.Roll_number+" "+s.name);
        }
    }
}