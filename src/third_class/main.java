package third_class;

public class main {
    static {
        System.out.println("I AM IN STATIC"); // static blocks always runs first even before the main class
    }
    public static void main(String[] args) {
        System.out.println(" I AM IN MAIN ");
        A.display();
        A.bread--;
        A.display();
        B.display();

    }

}
