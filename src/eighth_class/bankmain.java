package eighth_class;

import third_class.B;

import java.util.Scanner;

public class bankmain {
    public static void main(String[] args) {
        Bank account = new Bank();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=-1){
//            try{
//                account.withdraw(n);
//            }
//            catch (InsufficientBalanceException  e){
//                System.out.println(e.getMessage());
//            }
            account.withdraw(n); // we do not need try catch or "throws" for run time exception
            n = in.nextInt();
        }
    }
}
