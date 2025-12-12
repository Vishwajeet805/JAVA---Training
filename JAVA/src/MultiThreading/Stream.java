package MultiThreading;
import java.util.*;
public class Stream {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(100);
    list.add(200);
    list.add(300);
    list.add(98);
    list.add(75);
    list.add(31);
    list.add(22);
    List<Integer> result = list.stream().filter(n->n>75).toList();
    List<Integer> mapresult = list.stream().map(n->n*2).toList();
    System.out.println(result);
    System.out.println(mapresult);
}
}
