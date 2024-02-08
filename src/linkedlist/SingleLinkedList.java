package linkedlist;

public class SingleLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //insert at first position
    public void insertFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //insert at last position
    public void insertLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLastNode = secondLastNode.next;
            lastNode = lastNode.next;
        }

        secondLastNode.next = null;
    }

    /* Given a reference (pointer to pointer) to the head of
       a list
       and a position, deletes the node at the given
       position */
    void deleteNode(int position)
    {
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list
    }

    /* Function to get the Nth node from the last of a
       linked list */
    void printNthFromLast(int N)
    {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        // check if value of N is not more than length of
        // the linked list
        if (len < N)
            return;

        temp = head;

        // 2) get the (len-N+1)th node from the beginning
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.insertFirst("big");
        sl.insertFirst("a");
        sl.insertFirst("is");
        sl.insertLast("list");
        sl.insertFirst("this");
        sl.printList();
//        sl.deleteFirst();
//        sl.printList();
//        sl.deleteLast();
//        sl.deleteNode(2);
//        sl.printList();
        sl.printNthFromLast(2);
    }
}
