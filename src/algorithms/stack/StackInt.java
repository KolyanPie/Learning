package algorithms.stack;


/**
 * Этот класс должен реализовать базовую функциональность стека на основе массива.
 * Необходимо написать код в пропущенных методах
 */
public class StackInt {

    private int maxSize;    // Размер массива
    private int[] stackArray;
    private int top;        // Индекс вершины стека

    public StackInt(int size) {
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }


    //Добавление элемента в стек

    public void push(int value) {
        if (top==maxSize-1) return;
        top++;
        stackArray[top] = value;

    }


    //Извлечение элемента

    public int pop() {

        top--;
        return stackArray[top+1];
    }


    // @return верхний элемент, не удаляя его из стека

    public int peek() {
        
        return stackArray[top];
    }


    // @return true, если стек пуст

    public boolean isEmpty() {
        return top<0;

    }


    // @return true, если стек заполнен

    public boolean isFull() {
        return top==maxSize-1;
    }
}
