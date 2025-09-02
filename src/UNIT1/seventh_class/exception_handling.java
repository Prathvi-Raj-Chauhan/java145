package UNIT1.seventh_class;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) throws IOException {

        int x,y,z = 0;

        DataInputStream dis = new DataInputStream(System.in);
        int b = dis.readInt(); // If we don't handle the IO exceptions this wont work because it belongs to io package and handling io package is necessary if using io package
//        using this IOException fixes the error 🟩 "public static void main(String[] args) throws IOException {"
//        either use Exception e in catch block
//        this is an example of "Checked Exception" it is checked in compile time only
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