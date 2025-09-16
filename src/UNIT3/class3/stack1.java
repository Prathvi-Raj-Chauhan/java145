package UNIT3.class3;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.push("First");
        stk.push("Second");
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.size());

        stk.clear();
        System.out.println(stk.isEmpty());
    }
}
