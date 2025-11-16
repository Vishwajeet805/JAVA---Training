    package Strings;
public class VowelCount {
    public static void main(String[] args) {
        System.out.println("6️⃣ Count vowels in a string:");
        String input = "Rupesh Kumar";
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        System.out.println("Vowels: " + count);
    }
}