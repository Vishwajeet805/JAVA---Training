package ArrayList;
import java.util.ArrayList;

class ArrayListLoopDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements using loop
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
        }

        // Print using loop
        System.out.println("ArrayList elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Search element using loop
        int key = 30;
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                System.out.println("Found: " + key);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Not Found");

        // Update all elements using loop
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 5);   // increase each by 5
        }
        System.out.println("Updated List: " + list);

        // Remove even numbers using loop
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--; // adjust index after removal
            }
        }
        System.out.println("After Removing Even Numbers: " + list);
    }
}