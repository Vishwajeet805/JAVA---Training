package MultiThreading;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(98);
        list.add(75);
        list.add(31);
        list.add(22);
        List<Integer> result = list.stream().filter(n -> n > 75).toList();
        List<Integer> mapresult = list.stream().map(n -> n * 2).toList();
        int data = list.stream().reduce(0, (a, b) -> a + b);
        List<Integer> skip = list.stream().skip(2).toList();
        List<Integer> limit = list.stream().limit(2).toList();
        List<Integer> sort = list.stream().sorted((a, b) -> a - b).toList();
        System.out.println("Element greater than:75" + result);
        System.out.println(mapresult);
        System.out.println(data);
        System.out.println(skip);
        System.out.println(limit);
        System.out.println(sort);
    }
}
