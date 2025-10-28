package UNIT2.class4;

@FunctionalInterface
interface Sayable{ // functional interfaces are single abstract methods so more than one are not allowed
    void Say();
    default void sayMore(){
        System.out.println("Hii i am in saymore default method");
    }
    static void sum(int x, int y){
        System.out.println(x+y);
    }
}


public class MethodRefrencing {
    //refrence to static method   -- ClassName::staticMethodName
    //refrence to instance method of obeject   --


    public static void saySomething(){// this way this method is refrenced to sayable means its body is used in sayable's say method
        System.out.println("Hello this is static method");
    }




}
