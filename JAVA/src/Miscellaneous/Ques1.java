import java.util.HashMap;

class LongestSubarraySumK {
    static int longestSubarray(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k)
                maxLen = i + 1;

            if (!map.containsKey(sum))
                map.put(sum, i);

            if (map.containsKey(sum - k))
                maxLen = Math.max(maxLen, i - map.get(sum - k));
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {1, -1, 5, -2, 3};
        System.out.println(longestSubarray(a, 3));
    }
}
