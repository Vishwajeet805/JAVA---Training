package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
class Sort {
    public static void main() {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);

    }
}

