package fifth_class;

public class person {
    public static String address;
    public person(){

    }
    person(String address){
        this.address = address;
    }
    public void getAddress(){
        System.out.println("His address is "+  address);
    }
}
