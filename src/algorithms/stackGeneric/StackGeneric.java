package algorithms.stackGeneric;


import java.util.Collection;

/**
 * Этот класс должен реализовать базовую функциональность стека на основе массива.
 * Необходимо написать код в пропущенных методах
 */
public class StackGeneric<T> {

    private int maxSize;    // Размер массива
    private Object[] stackArray;
    private int top;        // Индекс вершины стека

    public StackGeneric(int size) {
        this.maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    /**
     * Добавление элемента в стек
     */

    private void push(T type, Object[] element, int top) {
        if (top == maxSize - 1) return;
        stackArray[top] = type;
    }

    public void push(T type) {
        top++;
        push(type,stackArray,top);
    }

    /**
     * Извлечение элемента
     */
    private T pop(Object[] stackArray, int top) {
        return (T)stackArray[top--];
    }

    public T pop() {
        return pop(stackArray, top);
    }


    /**
     * @return верхний элемент, не удаляя его из стека
     */

        private T peek(Object[] stackArray, int top) {
            return (T)stackArray[top--];
        }

        public T peek() {
            return peek(stackArray, top);
        }

    /**
     * @return true, если стек пуст
     */


    public boolean isEmpty() {
        return top < 0;

    }

    /**
     * @return true, если стек заполнен
     */


    public boolean isFull() {
        return top == maxSize - 1;
    }
}
