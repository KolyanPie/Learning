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
        
        for (int i=0; i<maxSize; i++){
            if(stackArray[i]!=0) continue;
            stackArray[i]=value;
            break;
        }

    }

    
     //Извлечение элемента
    
    public int pop() {
        
        for (int i=maxSize-1; i==0; i--){
            if(stackArray[i]==0) continue;
            int value = stackArray[i];
            stackArray[i] = 0;
            return value;
        }

    }

    
    // @return верхний элемент, не удаляя его из стека
     
    public int peek() {
         for (int i=maxSize-1; i==0; i--){
            if(stackArray[i]==0) continue;
            return stackArray[i];
        }

    }

    
    // @return true, если стек пуст
     
    public boolean isEmpty() {
        return stackArray[0]==0;

    }

    
    // @return true, если стек заполнен
     
    public boolean isFull() {
        return stackArray[maxSize]!=0;
    }
}
