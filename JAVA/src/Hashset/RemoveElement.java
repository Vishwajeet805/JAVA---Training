package Hashset;

import java.util.*;

class Remove {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(15);
        set.remove(5);

        System.out.println(set);
    }
}
