package Hashset;
import java.util.HashSet;

class Intersect {
    static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr3[]={2,5,3,5};

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> union=new HashSet<>();
        for (int nums: arr3){
            union.add(nums);
        }
        System.out.println(union);
    }
}
