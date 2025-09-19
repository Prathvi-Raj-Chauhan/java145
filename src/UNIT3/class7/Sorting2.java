package UNIT3.class7;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<CustomSorting.Student> ls = new ArrayList<>();
        ls.add(new CustomSorting.Student(20, "abhishek", 101));
        ls.add(new CustomSorting.Student(21, "abhishe", 102));
        ls.add(new CustomSorting.Student(52, "abhish", 100));
        ls.add(new CustomSorting.Student(74, "abhis", 10));
        ls.add(new CustomSorting.Student(2, "abhi", 60));

        Collections.sort(ls);
        for(CustomSorting.Student st: ls){
            System.out.println(st.name + " roll no " + st.roll_no + " age " + st.age);
        }
    }
}
