package UNIT2.class3;

public class MethodRefMain {
    public static void main(String[] args) {// way to access the method in main method
//        Sayable say = MethodRefrencing::saySomething;
//        say.Say();
//        SayableNonStatic say = MethodRefrencingNonStatic::saySomething; we cannot access it this way because now the method is not static so we have to make its object
        MethodRefrencingNonStatic methodRefrencingNonStatic = new MethodRefrencingNonStatic();
        SayableNonStatic say = methodRefrencingNonStatic::saySomething;
        say.Say();
    }
}
