package UNIT3.class5;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner in =  new Scanner(System.in);
        set.add(in.next());
        set.add(in.next());
        set.add(in.next());
        System.out.println(set);
        set.remove("two");
        System.out.println(set);

        HashSet<String> set1 = new HashSet<>();
        set1.add(in.next());
        set1.add(in.next());
        set1.addAll(set);
        System.out.println(set1);
        set1.remove(set);
        System.out.println(set1);
        set1.removeIf(str->str.contains("four"));
        System.out.println(set1);
    }
}
