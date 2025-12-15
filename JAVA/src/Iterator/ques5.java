package Iterator;

import java.util.*;
import java.util.ListIterator;

class Ques4 {
    public static void main(String[] args) {
            ArrayList<Integer> a = new ArrayList<>();
a.add(1); a.add(2);
Iterator<Integer> it = a.iterator();
while(it.hasNext())
    it.next();

    }
}