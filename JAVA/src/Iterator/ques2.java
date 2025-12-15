package Iterator;

import java.util.*;
import java.util.ListIterator;

class Ques2 {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
list.add(10); list.add(15); list.add(20);
Iterator<Integer> it = list.iterator();
while(it.hasNext()){
    if(it.next() > 15)
        it.remove();
}
System.out.println(list);
    }
}