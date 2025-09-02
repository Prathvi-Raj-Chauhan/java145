package UNIT1.eighth_class;

public class Bank {
    private  int balance = 1000;
    public void withdraw(int amount){
        if(amount > balance){
            throw new InsufficientBalanceException("Aukaat ke hisaab se paise nikaal, GAREEB !!");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal Successful, remaining balance = " + balance);
        }
    }
}
