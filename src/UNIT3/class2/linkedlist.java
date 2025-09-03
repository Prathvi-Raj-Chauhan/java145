package UNIT3.class2;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");

        Iterator itr = ll.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //remove particular object

        ll.remove("Second");
        System.out.println(ll);
        ll.addFirst("Zeroth");
        ll.addLast("Fourth");
        System.out.println(ll);
    }
}
