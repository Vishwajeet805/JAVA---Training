package Iterator;

import java.util.*;


class Ques8 {
    public static void main(String[] args) {
       List<Integer> a = Collections.unmodifiableList(List.of(1,2,3));
Iterator<Integer> it = a.iterator();
while(it.hasNext())
    System.out.println(it.next());

    }
}