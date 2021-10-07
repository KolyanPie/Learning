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

    /**
     * Добавление элемента в стек
     */
    public void push(int value) {

    }

    /**
     * Извлечение элемента
     */
    public int pop() {

    }

    /**
     *  @return верхний элемент, не удаляя его из стека
     */
    public int peek() {

    }

    /**
     * @return true, если стек пуст
     */
    public boolean isEmpty() {

    }

    /**
     * @return true, если стек заполнен
     */
    public boolean isFull() {

    }
}