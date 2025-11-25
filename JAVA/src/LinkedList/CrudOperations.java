package LinkedList;
import java.util.LinkedList;

 class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // CREATE – Add values
        for (int i = 1; i <= 5; i++) {
            list.add(i * 5);       // 5, 10, 15, 20, 25
        }

        // READ – Display values
        System.out.println("LinkedList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // UPDATE – modify a value inside loop
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 15) {   // update 15 → 150
                list.set(i, 150);
            }
        }
        System.out.println("After Update: " + list);

        // DELETE – remove an element using loop
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 10) {   // delete 10
                list.remove(i);
                break;
            }
        }
        System.out.println("After Delete: " + list);
    }
}
