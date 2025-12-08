import models.Node;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Node<Person> node1 = new Node<Person>(new Person(30, "Juan"));
        Node<Person> node2 = new Node<Person>(new Person(35, "Maria"));
        Node<Person> node3 = new Node<Person>(new Person(20, "Pepito"));
        Node<Person> node4 = new Node<Person>(new Person(10, "Diego"));


        node1.setNext(node2); // J -> M
        node2.setNext(node3); // M -> P
        node3.setNext(node4); // P -> D

        System.out.println(node1);

    }
}
