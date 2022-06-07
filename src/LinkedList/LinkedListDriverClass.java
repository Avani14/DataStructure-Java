package LinkedList;

public class LinkedListDriverClass {
    public static void main(String[] args) {
        System.out.println("======Linked List======");
        LinkedListServiceClass ll = new LinkedListServiceClass();
        // Use case 1
        ll.insert(56);
        ll.printList();
        System.out.println();
        ll.insert(30);
        ll.printList();
        System.out.println();
        ll.insert(70);
        ll.printList();
        System.out.println();
        ll.removeAll();
        //Use Case 2 Inserting first
        ll.insert(70);
        ll.printList();
        System.out.println();
        ll.insertFirst(30);
        ll.printList();
        System.out.println();
        ll.insertFirst(56);
        ll.printList();
        System.out.println();
        // Insert After Use case 3
        ll.removeAll();
        ll.insert(56);
        ll.printList();
        System.out.println();
        ll.insertAfter(30,56);
        ll.printList();
        System.out.println();
        ll.insertAfter(70,30);
        ll.printList();
        System.out.println();
        // Delete first
        ll.deleteFirst();
        ll.printList();
        System.out.println();
        // Delete last
        ll.insert(56);
        ll.printList();
        ll.insert(30);
        ll.printList();
        ll.insert(70);
        ll.printList();
        ll.deleteLast();
        ll.printList();
    }
}
