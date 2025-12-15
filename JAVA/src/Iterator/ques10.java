package Iterator;

import java.util.*;

class Ques10 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        Iterator<Integer> it1 = a.iterator();
        Iterator<Integer> it2 = a.iterator();
        while (it1.hasNext())
            System.out.println(it1.next());
        while (it2.hasNext())
            System.out.println(it2.next());

    }
}