package fifth_class;
// something like multiple inheritance can be done by the interfaces
public class interfaces implements  Printable, showable{ // either have to make this class abstract or provide implementation of method from the interface because the methods inside it are abstract
    // any variable declared inside the interface is public static final by default
    // any method declared inside the interface is public abstract
    public void print(){
        System.out.println("Print method implemented");
    }
    public void show(){
        System.out.println("Show method implemented");
    }

    public static void main(String[] args) {
        interfaces inter = new interfaces();
        inter.print();
        inter.show();
        // default static and privates cannot be accessed from interfaces

    }
}
