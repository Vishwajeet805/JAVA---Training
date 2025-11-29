package Hashset;

import java.util.*;

class Loops {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
