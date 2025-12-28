package Miscellaneous;

import java.util.HashSet;

class LongestConsecutive {
    static int longestConsecutive(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);

        int longest = 0;
        for (int x : a) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(a));
    }
}
