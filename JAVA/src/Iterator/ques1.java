package Iterator;
import java.util.*;
import java.util.ListIterator;

class Ques1 {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
            int mid = list.size() / 2;

            ListIterator<Integer> it = list.listIterator();
            for (int i = 0; i <= mid && it.hasNext(); i++) {
                System.out.print(it.next());
            }

            for (int i = 0; i < 2 && it.hasNext(); i++) it.next();
            for (int i = mid - 1; i >= 0 && it.hasPrevious(); i--) {
                System.out.print(it.previous());
            }
        }///moveforwardunitltargetvaluenotfoundthenmoveitbackwards
}