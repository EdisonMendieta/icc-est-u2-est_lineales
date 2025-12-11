package controllers;

import models.Node;

public class ListaEnlazada<T> {

    private Node<T> head;
    private int size;

    public ListaEnlazada() {
        this.head = null;
        this.size= 0;
    }

    public void append(T data){

        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;

        }else{
            Node<T> aux = head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
        size++;
    }

    public void deleteFirst(){
        //Eliminar
        head = head.getNext();
        size--;
    }

    // iterar y eliminar el ultimo
    public void deleteLast(){

        if (head == null) { 
            
        }
        else if (head.getNext() == null) { 
            head = null;            
        }else{
            Node<T> aux = head;
            while (aux.getNext().getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(null); 
        }
        size--;
    }   

    //Eliminar un nodo en especifico
    public void deleteNode(T data){
        if (head == null) {
            return;    
        }
        if (head.getValue() == data) {
            deleteFirst();
            return;
        }

    }

    public void printAllNodes(){
    Node<T> auxi = head;
        System.out.print(" Cima -> ");
        while (auxi != null) {
            System.out.print(auxi.getValue() + " -> ");
            auxi = auxi.getNext();
            
        }
        System.out.println(" FIN ");
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
 
}
