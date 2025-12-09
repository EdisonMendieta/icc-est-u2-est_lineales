package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack<T> {

    private Node<T> top;
    private int size;
    
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    //Metodo para insercion
    public void push(T dato){
        Node<T> newNode = new Node<T>(dato);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    //Metodo de sacar y/o eliminar
    public T pop(){
        if (top == null) {

            //returna null
            throw new EmptyStackException();
        }
        T data = top.getValue();
        top = top.getNext();
        size--;
        return data;
    }

    //retorna el primero sin eliminar
     public T peek(){
        if (top == null) //si el if no tiene {} se ejecuta la primera linea
            return null;  

        T data = top.getValue();
        return data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        
        /* 
        if (isEmpty()){ //si el if no tiene {} se ejecuta la primera linea
            return 0;
        }   

        int count = 1;
        Node<T> auxi = top;
        while (auxi.getNext() != null) {
            auxi = auxi.getNext();
            count++;
        }*/

        return size;
    }

    public void printAllNode(){ 

        
        Node<T> auxi = top;
        System.out.println(" Cima -> ");
        while (auxi != null) {
            System.out.println(auxi.getValue() + " -> ");
            auxi = auxi.getNext();
            
        }
        System.out.println(" FIN ");
    }
}
