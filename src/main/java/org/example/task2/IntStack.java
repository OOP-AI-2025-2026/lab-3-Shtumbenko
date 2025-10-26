package org.example.task2;

public class IntStack {

    private int[] data;
    private int top;
    private int capacity;

    public IntStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Місткість має бути позитивною");
        }
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow: Стек повний");
        }
        data[++top] = value;
        System.out.println("Додано: " + value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty: Неможливо виконати pop");
        }

        int value = data[top--];
        System.out.println("Виштовхнуто: " + value);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty: Неможливо виконати peek");
        }
        return data[top];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack (empty)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Stack (вершина ->) [");
        for (int i = top; i >= 0; i--) {
            sb.append(data[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
