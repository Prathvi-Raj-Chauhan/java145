package UNIT3.class1;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements of required array");
        int[] arr = new int[in.nextInt()];
        System.out.println("Start entering elements one by one");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
