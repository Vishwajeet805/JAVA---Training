package LinkedList;
import java.util.LinkedList;

class LinkedListLoop {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements using loop
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
        }

        // Print using loop
        System.out.println("LinkedList elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Search element
        int key = 40;
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                System.out.println("Found: " + key);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not Found");

        // Update using loop
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 2);  // add 2 to each value
        }
        System.out.println("Updated LinkedList: " + list);

        // Remove elements < 25 using loop
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 25) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("After Removing < 25: " + list);
    }
}
