public class Stringpool {

    public static void main(String[] args) {
        System.out.println("3️⃣ String Pool Example:");
        String p1 = "Hello";
        String p2 = "Hello";
        String p3 = new String("Hello");
        System.out.println(p1 == p2); // true (same literal from pool)
        System.out.println(p1 == p3); // false (new object)
    }
}