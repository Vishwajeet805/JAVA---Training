package Iterator;

import java.util.*;
import java.util.ListIterator;

class Ques6 {
    public static void main(String[] args) {
            HashMap<Integer,String> m = new HashMap<>();
m.put(1,"One"); m.put(2,"Two");
Iterator<String> it = m.values().iterator();
while(it.hasNext())
    System.out.println(it.next());

    }
}