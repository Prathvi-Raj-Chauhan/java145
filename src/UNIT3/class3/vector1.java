package UNIT3.class3;

import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(3,2);
        vec.add("First");
        vec.add("2nd");
        vec.add("3rd");
        vec.add("4th");
        System.out.println(vec.capacity());
        System.out.println(vec.size());
    }
}
