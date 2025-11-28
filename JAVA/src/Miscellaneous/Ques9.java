package Miscellaneous;

class LeadersInArray {
    static void leaders(int[] a) {
        int max = a[a.length - 1];
        System.out.print(max + " ");

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > max) {
                max = a[i];
                System.out.print(max + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        leaders(a);
    }
}
