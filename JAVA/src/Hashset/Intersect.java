package Hashset;
import java.util.HashSet;

class Intersect {
    static void main(String[] args) {
        int arr[]={2,3,4,5};
        int arr3[]={2,5,3,5,1};

        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> union=new HashSet<>();
        HashSet<Integer> intersect=new HashSet<>();
        for (int nums: arr3){
            set.add(nums);
        }

        System.out.println(set);
        for (int nums:arr)
        {
         if (set.contains(nums))
         {
             intersect.add(nums);
         }
        }
        System.out.println(intersect);
    }
}
