package Miscellaneous;

class FirstNonRepeating {
    static char firstUnique(String s) {
        int[] freq = new int[256];

        for (char c : s.toCharArray())
            freq[c]++;

        for (char c : s.toCharArray())
            if (freq[c] == 1)
                return c;

        return '-';
    }

    public static void main(String[] args) {
        System.out.println(firstUnique("swiss"));
    }
}
