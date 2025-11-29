package Hashset;
import java.util.HashSet;

class Duplicate {
    static void main(String[] args) {
        int arr[]={1,2,3,3,1};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> dup=new HashSet<>();
        HashSet<Integer> rep=new HashSet<>();

        for (int nums: arr){
            if(!set.add(nums)){
                dup.add(nums);
            }
        }
        System.out.println(dup);


        System.out.println(dup);

    }
}
