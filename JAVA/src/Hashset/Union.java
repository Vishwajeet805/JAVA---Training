package Hashset;

import java.util.*;

class Union {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(1); a.add(2);

        HashSet<Integer> b = new HashSet<>();
        b.add(3); b.add(2);

        a.addAll(b); // union
        System.out.println(a);
    }
}
