package Hashset;
import java.util.*;

class Intersection {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(1); a.add(2); a.add(3);

        HashSet<Integer> b = new HashSet<>();
        b.add(2); b.add(3); b.add(4);

        a.retainAll(b); // intersection
        System.out.println(a);
    }
}
