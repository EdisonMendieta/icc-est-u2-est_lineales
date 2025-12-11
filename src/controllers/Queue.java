package controllers;

import models.Node;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int count;

    public Queue(){
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public void push(T dato){
        Node<T> newNode = new Node<T>(dato);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        }else{
            last.setNext(newNode);
            last = newNode;
        }
        count++;
    }

    public  boolean isEmpty(){
        return first == null;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T data = first.getValue();
        first = first.getNext();

        if (first == null) {
            last = null;
        }
        count--;

        return data;
    }

    public int size(){
        return count;
    }
    
    public void printAllNode(){
    Node<T> auxi = first;
        System.out.print(" Cima -> ");
        while (auxi != null) {
            System.out.print(auxi.getValue() + " -> ");
            auxi = auxi.getNext();
            
        }
        System.out.println(" FIN ");
    }

    //getter y setter

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }
}
