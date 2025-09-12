package UNIT3.class5;

import java.util.TreeSet;

public class sortedSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("One");
        ts.add("Two");
        ts.add("Three");
        ts.add("Four");
        System.out.println(ts); // sort them in ascending order
    }
}
