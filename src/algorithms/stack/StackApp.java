package algorithms.stack;

public class StackApp {

    public static void main(String[] args) {
        StackInt stack = new StackInt(10);
        stack.push(10);
        stack.push(50);
        stack.push(120);
        stack.push(150);
        stack.pop();
        System.out.println(stack.peek()==120);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        stack.push(120);
        System.out.println(stack.peek()==100);
        System.out.println(stack.isFull());
        for(int i=0;i<10;i++){
        stack.pop();
        }
        System.out.println(stack.isEmpty());


        // Здесь протестировать работу написанного StackInt, показав, что он работает
    }
}
