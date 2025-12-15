package Iterator;

import java.util.*;
import java.util.ListIterator;

class Ques3 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            Student(int i, String n) {
                id = i;
                name = n;
            }
        }
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(1, "A"));
        Iterator<Student> it = s.iterator();
        while (it.hasNext())
            System.out.println(it.next().name);
    }
}