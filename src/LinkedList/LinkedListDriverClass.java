package LinkedList;

public class LinkedListDriverClass {
    public static void main(String[] args) {
        System.out.println("======Linked List======");
        LinkedListServiceClass ll = new LinkedListServiceClass();
        ll.insert(56);
        ll.printList();
        System.out.println();
        ll.insert(30);
        ll.printList();
        System.out.println();
        ll.insert(70);
        ll.printList();
        System.out.println();
    }
}
