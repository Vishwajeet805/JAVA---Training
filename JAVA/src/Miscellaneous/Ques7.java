package Miscellaneous;
class RemoveDuplicatesLL {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    static Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(1);
        a.next.next = new Node(2);
        a.next.next.next = new Node(3);
        a.next.next.next.next = new Node(3);

        Node res = removeDuplicates(a);
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.next;
        }
    }
}

