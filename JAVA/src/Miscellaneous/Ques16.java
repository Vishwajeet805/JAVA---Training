package Miscellaneous;

class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] freq = new int[256];
        for (char c : a.toCharArray()) freq[c]++;
        for (char c : b.toCharArray()) freq[c]--;

        for (int x : freq)
            if (x != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}
