
public class StringQuestions {

    public static void main(String[] args) {

        // 1️⃣ Difference between String, StringBuilder, and StringBuffer
        System.out.println("1️⃣ String vs StringBuilder vs StringBuffer");
        String s1 = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("String: " + s1);
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
        System.out.println("--------------------------------------\n");

        // 2️⃣ Are Strings immutable in Java?
        System.out.println("2️⃣ String immutability demonstration:");
        String str1 = "Java";
        String str2 = str1.concat(" Programming");
        System.out.println("Original String: " + str1);      // Java
        System.out.println("After concat(): " + str2);       // Java Programming
        System.out.println("--------------------------------------\n");

        // 3️⃣ String Pool Example
        System.out.println("3️⃣ String Pool Example:");
        String p1 = "Hello";
        String p2 = "Hello";
        String p3 = new String("Hello");
        System.out.println(p1 == p2); // true (same literal from pool)
        System.out.println(p1 == p3); // false (new object)
        System.out.println("--------------------------------------\n");

        // 4️⃣ "hello" == new String("hello")
        System.out.println("4️⃣ Comparison:");
        System.out.println("hello" == new String("hello")); // false
        System.out.println("--------------------------------------\n");

        // 5️⃣ substring(), indexOf(), charAt()
        System.out.println("5️⃣ substring(), indexOf(), charAt():");
        String str = "CodingThinker";
        System.out.println(str.substring(0, 6)); // Coding
        System.out.println(str.indexOf('T'));    // 6
        System.out.println(str.charAt(3));       // i
        System.out.println("--------------------------------------\n");
    }}
