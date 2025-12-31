package Miscellaneous;

class MiddleOfLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static int findMiddle(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);

        System.out.println(findMiddle(a));
    }
}
