package LinkedList;

import java.util.LinkedList;

class list2Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>();

        list.add(5);
        list.add(6);
        list.addFirst(22);   // same as add(0, 22)
        System.out.println(list);

        list1.add(1);
        list1.add(1, 11);
        list1.addAll(list);
        System.out.println(list1);

        int first = list1.getFirst();
        int last = list1.getLast();
        System.out.println(first);
        System.out.println(last);

        list1.set(2, 3);
        System.out.println(list1);
    }
}
