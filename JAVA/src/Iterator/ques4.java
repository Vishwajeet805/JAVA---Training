package Iterator;

import java.util.*;

class Ques4 {
    public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
a.add(1); a.add(2);
Iterator<Integer> i = a.iterator();
a.add(3);   // ConcurrentModificationException
    }
}