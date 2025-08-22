package fifth_class;

public interface Printable { // interfaces are always implemented only
    void print(); // has no body so this is the abstract one
    private void my(){
        System.out.println("this is my private method");
    }
    public static void mystatic(){
        System.out.println("This is my static method");
    }
}