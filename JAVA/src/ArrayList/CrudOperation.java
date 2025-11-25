package ArrayList;

import java.util.ArrayList;

 class ArrayListCRUD {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // CREATE – Add values
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);      // 10,20,30,40,50
        }

        // READ – Display values
        System.out.println("ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // UPDATE – Change value at index using loop
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 30) {   // update 30 → 300
                list.set(i, 300);
            }
        }
        System.out.println("After Update: " + list);

        // DELETE – Remove a value using loop
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 20) {   // delete 20
                list.remove(i);
                break;
            }
        }
        System.out.println("After Delete: " + list);
    }
}
