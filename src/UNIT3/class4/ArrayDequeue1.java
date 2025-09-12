package UNIT3.class4;

import java.util.ArrayDeque;

public class ArrayDequeue1 {
    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.add("1st");
        boolean offerfrst = (adq.offerFirst("0th"));
        boolean offerlst = adq.offerLast("2nd");
        System.out.println(offerfrst);
        System.out.println(offerlst);
        adq.addFirst("-1");
        adq.addLast("3rd");
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());


    }
}
