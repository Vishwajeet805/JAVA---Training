    package Strings;
class StringFrequency {
    public static void main(String[] args) {
        String str = "aabcccde";

        int[] freq = new int[256]; // For all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
}
