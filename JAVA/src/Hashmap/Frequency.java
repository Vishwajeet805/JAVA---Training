package Hashmap;

import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[]={2,3,4,2,4,2};
        for(int x : a){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        }
}