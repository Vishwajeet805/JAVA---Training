package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    // insert at beginning
    void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert at end
    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // insert at specific position (0-based index)
    void insertAtPos(int data, int pos) {
        if (pos == 0) {
            insertFirst(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // delete first node
    void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // delete last node
    void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // delete node by value
    void deleteByValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // search element
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // count nodes
    int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // reverse linked list
    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class LinkedMan {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertLast(40);
        ll.insertAtPos(25, 2);

        ll.display();

        ll.deleteFirst();
        ll.deleteLast();
        ll.deleteByValue(25);

        ll.display();

        System.out.println("Search 20: " + ll.search(20));
        System.out.println("Size: " + ll.size());

        ll.reverse();
        ll.display();
    }
}
