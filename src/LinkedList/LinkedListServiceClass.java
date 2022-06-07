package LinkedList;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}
public class LinkedListServiceClass {
    //Head of list
    static Node head;
    static Scanner sc = new Scanner(System.in);

    //Inserting data at last
    public  void insert(int data) {
        Node node = new Node(data);

        if(head == null) {
            head = node;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    //Printing list
    public  void printList() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

}
