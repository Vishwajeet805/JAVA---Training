package Basics;
public class Split {
    public static void main(String[] args) {
        String str = "Hello Java";
        String a[] = str.split(" ");

        for (String str1 : a) {
            System.out.println(str1);
        }
    }
}