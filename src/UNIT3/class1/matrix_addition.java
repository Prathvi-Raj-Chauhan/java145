package UNIT3.class1;

import java.util.Arrays;
import java.util.Scanner;

public class matrix_addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimension of Arrays");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] mat1 = new int[m][n];
        System.out.println("Now enter elements row wise");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mat1[i][j] = in.nextInt();
            }
        }
        System.out.println("MAT1");
        System.out.println(Arrays.deepToString(mat1));
        int[][] mat2 = new int[m][n];
        System.out.println("Now enter elements row wise");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mat2[i][j] = in.nextInt();
            }
        }
        System.out.println("MAT2");
        System.out.println(Arrays.deepToString(mat2));

        int[][] mat3 = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("After addition");
        System.out.println(Arrays.deepToString(mat3));
    }
}
