package UNIT2.class1;

public class MyMain {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
//        th1.setPriority(1);
        System.out.println(th1.getName());
        th1.setName("Thread 1");
        System.out.println(th1.getName());
    }
}
