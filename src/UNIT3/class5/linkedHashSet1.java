package UNIT3.class5;

import java.util.LinkedHashSet;

public class linkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("one");
        lhs.add("two");
        lhs.add("four");
        lhs.add("three");
        lhs.add("three");
        System.out.println(lhs); // this maintains order of addition of elements, it maintains the order in which they were added into the set
    }
}
