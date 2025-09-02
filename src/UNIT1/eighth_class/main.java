package UNIT1.eighth_class;

import java.util.Scanner;

//import static UNIT1.eighth_class.UserDefinedException.validate;

public class main {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
//        validate(n);
        UserDefinedException udf = new UserDefinedException();
        try{
            udf.validate(n);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
