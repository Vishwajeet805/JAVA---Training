package Hashmap;


import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int ar[]={2,7,5,4};
        HashMap<Integer,Integer>map=new HashMap<>();
        int target=12;
        for(int i=0;i<ar.length;i++){
            int diff=target-ar[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                break;
            }
            map.put(ar[i],i);
        }
    }
}