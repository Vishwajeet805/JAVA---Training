package Miscellaneous;
import java.util.Stack;

class NextGreaterElement {
    static void nextGreater(int[] a) {
        Stack<Integer> st = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= a[i])
                st.pop();

            int ans = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
            System.out.println(a[i] + " -> " + ans);
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 10, 8};
        nextGreater(a);
    }
}
