package Hashset;
import java.util.HashSet;

 class Hashset {
    static void main(String[] args) {
        int arr[]={1,2,3,3,1};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> dup=new HashSet<>();
        for (int nums: arr){
            if(!set.add(nums)){
                dup.add(nums);
            }
        }
        System.out.println(dup);
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println(set);
    }
}
