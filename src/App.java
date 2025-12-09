
import models.Node;
import models.Person;
import controllers.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
        Node<Person> node1 = new Node<Person>(new Person(30, "Juan"));
        Node<Person> node2 = new Node<Person>(new Person(35, "Maria"));
        Node<Person> node3 = new Node<Person>(new Person(20, "Pepito"));
        Node<Person> node4 = new Node<Person>(new Person(10, "Diego"));


        node1.setNext(node2); // J -> M
        node2.setNext(node3); // M -> P
        node3.setNext(node4); // P -> D

        System.out.println(node1);
        */
        runStackExample();

    }

    public static void runStackExample() {
        Stack<Person> persons = new Stack<Person>();
        persons.push(new Person(30, "Juan"));
        persons.push(new Person(30, "Maria"));
        persons.push(new Person(30, "Pepito"));
        persons.push(new Person(30, "Diego"));

        System.out.println("Size = " + persons.size());
        persons.printAllNode();
        System.out.println(persons.pop());
        System.out.println("Size = " + persons.size());
        persons.printAllNode();



    }


}
