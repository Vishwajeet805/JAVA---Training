package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class IteratorMain {
    static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(5);
        ListIterator<Integer>ot=list.listIterator();

        while (ot.hasNext()) {
            Integer x=ot.next();
            if(x==7){
//                ot.add(8);
                ot.set(5);
            }

        }
        while (ot.hasPrevious()){
            Integer x= ot.previous();
            System.out.println(x);
        }
        while (ot.hasNext()){
            Integer x= ot.next();
            System.out.println(x);
        }
        Iterator<Integer>it=list.iterator();
        while(it.hasNext())
        {
            if(it.next()==6){
                it.remove();
            }
            System.out.println(it.next());
        }
        System.out.println(list);

    }
}
