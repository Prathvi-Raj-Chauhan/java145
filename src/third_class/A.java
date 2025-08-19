package third_class;

public class A { // outer classes cannot be made as static only inner classes can be made as static
    static int bread = 10; // static variables are called class variables static variables are shared variable adn they are shared with other classes also if that static is changed it is changed all over
    public static void display(){
//        System.out.println("Slices Remaining " + bread);
        System.out.println("I am in class A");
    }


}
