package UNIT1.eighth_class;

import java.util.Scanner;

public class bankmain {
    public static void main(String[] args) {
        Bank account = new Bank();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=-1){
            try{
                account.withdraw(n);
            }
            catch (InsufficientBalanceException  e){
                System.out.println(e.getMessage());
            }
//**********  account.withdraw(n); // we do not need try catch or "throws" for run time exception code will work without it but if not used it will be terminated abnormally in checked one even on compilation we get error if we did not handle its exceptions
            n = in.nextInt();
        }
    }
}
