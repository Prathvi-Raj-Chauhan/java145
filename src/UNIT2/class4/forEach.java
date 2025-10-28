package UNIT2.class4;

import java.util.ArrayList;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("football");
        ls.add("cricket");
        ls.add("chess");
        ls.add("hockey");
        ls.forEach(System.out::println);
    }
}
