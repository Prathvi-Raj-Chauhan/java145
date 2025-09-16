package UNIT3.class6;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
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
