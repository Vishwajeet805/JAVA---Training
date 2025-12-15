package Iterator;

import java.util.*;
import java.util.ListIterator;

class Ques7 {
    public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> a = new ArrayList<>();
a.add(new ArrayList<>(List.of(1,2)));
a.add(new ArrayList<>(List.of(3,4)));
for(Iterator<ArrayList<Integer>> i = a.iterator(); i.hasNext();){
    Iterator<Integer> j = i.next().iterator();
    while(j.hasNext())
        System.out.println(j.next());
}

    }
}