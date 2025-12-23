import java.util.*;
class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] a, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[a.length - k + 1];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
            while (!dq.isEmpty() && a[dq.peekLast()] <= a[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) res[idx++] = a[dq.peekFirst()];
        }
        return res;
    }
}
