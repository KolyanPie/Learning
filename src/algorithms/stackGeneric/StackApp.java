package algorithms.stackGeneric;

import java.util.ArrayList;

public class StackApp {

    public static void main(String[] args) {
        StackGeneric<String> stack = new StackGeneric(10);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.pop();
        System.out.println(stack.peek().equals("3"));
        stack.push("4new");
        stack.push("5");
        stack.push("6");
        stack.push("6");
        stack.push("8");
        stack.push("9");
        stack.push("10");
        stack.push("11");
        stack.push("12");
        System.out.println(stack.peek().equals("10"));
        System.out.println(stack.isFull());
        for(int i=0;i<10;i++){
        stack.pop();
        }
        System.out.println(stack.isEmpty());


        // Здесь протестировать работу написанного StackInt, показав, что он работает
    }
}
