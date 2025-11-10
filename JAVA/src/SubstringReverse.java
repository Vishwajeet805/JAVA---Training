

public class SubstringReverse {
    public static void main(String[] args) {

        String str = "I Love Java";

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        System.out.println("Output: " + result);
    }
}
