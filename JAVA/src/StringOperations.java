import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello Java";
        String str2 =new String("hello java");
        String str1 = "Hello Java";
        System.out.println(str.equals(str2));
        System.out.println(str.length());
        System.out.println(str.equals(str1));
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("z"));
        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 4));
        System.out.println(str.trim());
    }
}