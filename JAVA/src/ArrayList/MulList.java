package ArrayList;


import java.util.ArrayList;

class list1Main {
    public static void main(String[] args) {
        ArrayList<Integer> List =new ArrayList<>();
        ArrayList<Integer> List1 =new ArrayList<>();
        List.add(5);
        List.add(6);
        List.add(0,22);
        System.out.println(List);
        List1.add(1);
        List1.add(1,11);
        List1.addAll(List);
        System.out.println(List1);
        int first = List1.get(0);
        int last = List1.get(List1.size()-1);
        System.out.println(first);
        System.out.println(last);
        List1.set(2,3);
        System.out.println(List1);
    }
}