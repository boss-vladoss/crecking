package com.company;
import java.util.Objects;

public class Stack<T> {
    private int size;
    private Node front;

    public Stack() {
        this.size = 0;
        front = null;
    }

    public int getSize() {
        return size;
    }

    public boolean empty(){
        return size == 0;
    }

    public T up(){
        return front.getValue();
    }

    public void pop(){
        front = front.getPrev();
        size--;
    }

    public void push(T value){
        Node val = new Node(value);
        if (size == 0){
            front = val;
        }
        else{
            val.setPrev(front);
            front = val;
        }
        size++;
    }

    class Node {
        private T value;
        private Node prev;

        public Node(T value) {
            this.value = value;
            this.prev = null;
        }

        public Node(T value, Node prev) {
            this.value = value;
            this.prev = prev;
        }

        public T getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, prev);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || (obj.getClass() != this.getClass()))
                return false;
            Node ob = (Node) obj;
            return Objects.equals(value, ob.value) && Objects.equals(prev, ob.prev);
        }
    }
}
