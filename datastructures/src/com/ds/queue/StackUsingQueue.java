package com.ds.queue;

public class StackUsingQueue<E> {

    private QueueLinkedList<E> queue;

    public StackUsingQueue() {
        queue = new QueueLinkedList<>();
    }

    // Costly push
    public void push(E element) {

        int size = queue.size();   // current size
        queue.add(element);

        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public E pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.remove();
    }

    public E peek() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}