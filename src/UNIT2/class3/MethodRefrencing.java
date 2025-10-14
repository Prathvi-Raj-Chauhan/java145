package UNIT2.class3;

@FunctionalInterface
interface Sayable{ // functional interfaces are single abstract methods so more than one are not allowed
    void Say();

}


public class MethodRefrencing {
    //refrence to static method   -- ClassName::staticMethodName
    //refrence to instance method of obeject   --


    public static void saySomething(){// this way this method is refrenced to sayable means its body is used in sayable's say method
        System.out.println("Hello this is static method");
    }




}
