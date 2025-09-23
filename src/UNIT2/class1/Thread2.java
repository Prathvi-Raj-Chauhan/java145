package UNIT2.class1;

public class Thread2 extends Thread{
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Mai hu dusri thread");
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
