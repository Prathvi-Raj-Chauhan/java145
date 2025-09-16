package UNIT3.class6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMap1 { // in linked hashmap ordering is  preserved in hashmap ordering is not preserved
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of queries");
        int n = in.nextInt();
        System.out.println("Start entering key first then value");
        for (int i = 0; i < n; i++) {
            String key = in.next();
            int val = in.nextInt();
            map.put(key, val);
        }
        for(String str : map.keySet()){
            System.out.println(str + " -> " +  map.get(str));
        }
    }
}
