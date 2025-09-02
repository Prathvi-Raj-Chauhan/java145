package UNIT3.class1;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> ls = new ArrayList<>();
//        ls.add(12);
//        ls.add(22);
//        ls.add(32);
//        ls.add(42);
//        ls.add(52);
//        ls.add(62);
//        ls.add(72);
//        ls.add(82);
//        ls.add(92);
//        ls.add(102);
//        ls.add(21);
//        ls.add(23);
//        ls.add(24);
//        System.out.println(ls);
//
//        for(int a : ls){
//            System.out.println(a);
//        }
        ArrayList<String> Products = new ArrayList<>();
        System.out.println("Enter number for Products");
        int n = in.nextInt();
        in.nextLine();
        System.out.println("Start Entering products");
        for(int i = 0; i < n; i++){
            Products.add(in.nextLine());
        }
        System.out.print("Products are ");
        Collections.sort(Products);
        for(String str : Products){
            System.out.print(str + " ");
        }
        System.out.println();
        Iterator it = Products.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        Products.add(1, "Apple");
        Products.addFirst("Xro");
        Products.addFirst("yo");
        System.out.println(Products.get(0));

    }
}
