package UNIT3.class7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(12);
        ls.add(2);
        ls.add(1);
        ls.add(42);
        ls.add(15);

        Collections.sort(ls, Comparator.reverseOrder());
//      Collections.reverse(ls);
        System.out.println(ls);
    }
}
