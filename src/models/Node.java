package models;

//T es para datos generales
public class Node <T>{

    //Atributos
    private T Value;

    //obligatorio
    private Node<T> next; //Puntero

    //Opcional
    private Node<T> prev; //puntero al nodo anterior

    //constructor
    public Node(T Value) {
        this.Value = Value;
        this.next = null;
        this.prev = null;
    }

    public T getValue() {
        return Value;
    }

    public void setValue(T value) {
        Value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node [ Value =" + Value + ", next =" + next +" ]" ;
    }


    
    

}