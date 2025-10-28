package UNIT2.class4;

import UNIT2.class4.MethodRefMain;

public class MethodRefMain {
    public static void main(String[] args) {// way to access the method in main method
        Sayable say = MethodRefrencing::saySomething;
        say.Say(); // that abstract method
        say.sayMore(); // for default method we use object name
        Sayable.sum(5,5); // for static method we use class name

    }
}
