package UNIT2.class3;

public class Lambda { // why we didnt even needed to implement this numericTest.java interface
    public static void main(String[] args) {
        NumericTest isEven = (n)->n%2==0; // this NumericTest is the name of the interface
        System.out.println(isEven.test(12));
    }
}
