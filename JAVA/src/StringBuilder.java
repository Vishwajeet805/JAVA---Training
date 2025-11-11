public class StringBuilder {
    public static void main(String[] args) {
        String s = "aaabbc";
        StringBuilder result = new StringBuilder();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            result.append(s.charAt(i));

            if (count > 1) {
                result.append(count);
            }
        }

        System.out.println(result.toString());
}
}
