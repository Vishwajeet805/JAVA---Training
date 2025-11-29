package Miscellaneous;

class SortedRotatedArray {
    static boolean check(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1])
                count++;
        }
        if (a[0] < a[a.length - 1])
            count++;
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 1, 2};
        System.out.println(check(a));
    }
}
