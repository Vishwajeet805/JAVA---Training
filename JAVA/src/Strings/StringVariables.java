package Strings;
// import java.util.Scanner;
public class StringVariables {
    static int a=5;
    int b=9;
    void FirstnonRep(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] ==1) {
                System.out.println((char) i );
            }
        }

    }
        void Sum () {
            System.out.println("Hello");
        }

    public static void main(String[] args){
        System.out.println(a);
        StringVariables obj=new StringVariables();
        System.out.println(obj.b);
        obj.Sum();
        obj.FirstnonRep("aabbcbb");
    }
}
