package Hashset;

import java.util.*;

class Convert2Array {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");

        Object arr[] = set.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
