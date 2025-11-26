package Hashmap;
import java.util.*;

public class Hashmap {
    static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,50);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.getOrDefault(11,12));
        for(int x :map.keySet()){
            System.out.println(map.get(x));
        }
    }
}
