package MultiThreading;
import java.util.*;
// To check element in the array greater than certain element than find the sum of odd number's.
public class Ques1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(3);
        list.add(11);
        List<Integer> result = list.stream().filter(n->n>5).toList();
        List<Integer> result1 = result.stream().filter(n->n%2==1).toList();
        int data = result1.stream().reduce(0,(a,b)->a+b);
        System.out.println("Element greater than 5:"+result);
        System.out.println("Odd number's which are greater than 5:"+result1);
        System.out.println("Sum of odd number:"+data);
    }
}