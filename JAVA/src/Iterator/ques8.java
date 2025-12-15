package Iterator;

import java.util.*;


class Ques8 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(10);
        a.add(15);
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x % 2 == 0)
                System.out.println(x);
        }
    }
}