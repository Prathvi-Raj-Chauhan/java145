package seventh_class;

import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {

        int x,y,z = 0;
        Scanner in = new Scanner(System.in);

        try{
            x = in.nextInt();
            y = in.nextInt();
            z = x/y;
            System.out.println("No exception occured!");
        }
//        catch (Exception e){ // all the other exceptions are caught in this only explicitly declaring and working with other like ArithmeticException or other is redundant
//
//        }
        catch (ArithmeticException e){ // we have to say what type of error we get
            System.out.println("SOME ERROR OCCURED " + e);
        }
        catch (InputMismatchException e){
            System.out.println("Wrong input entered by you " + e);
        }
        finally {
            System.out.println("RESULT " + z);

        }
    }
}