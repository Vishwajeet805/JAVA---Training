package Miscellaneous;
class DetectCycle {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = a;   // cycle

        System.out.println(hasCycle(a));
    }
}
