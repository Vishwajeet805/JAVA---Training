package Miscellaneous;

import java.util.HashMap;

class CountSubarraysSumK {
    static int countSubarrays(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;

        for (int x : a) {
            sum += x;
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, -2, 5};
        System.out.println(countSubarrays(a, 5));
    }
}
