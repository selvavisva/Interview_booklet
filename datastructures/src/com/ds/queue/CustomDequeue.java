package com.ds.queue;

import java.util.NoSuchElementException;

public class CustomDequeue<E> {

    private Node<E> head, tail;
    private int size = 0;

    private static class Node<E> {
        Node<E> prev, next;
        E item;

        Node(E e) {
            this.item = e;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Add at front
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    // Add at rear
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Remove from front
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E e = head.item;

        if (head == tail) {  // only one element
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return e;
    }

    // Remove from rear
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E e = tail.item;

        if (head == tail) {  // only one element
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return e;
    }

    public E peekFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        return head.item;
    }

    public E peekLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        return tail.item;
    }
}