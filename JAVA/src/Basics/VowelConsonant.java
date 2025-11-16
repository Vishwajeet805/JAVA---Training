package Basics;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
       String sre ="hello";
       int val =0;
       for (char ch:sre.toCharArray()){
           if("aeiou".indexOf(ch)!=-1){
               val++;
           }
       }
        System.out.println(val);

    }
}
