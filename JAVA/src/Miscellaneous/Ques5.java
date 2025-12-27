package Miscellaneous;
class KthSmallestBST {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int count = 0, ans = -1;

    static void inorder(Node root, int k) {
        if (root == null) return;
        inorder(root.left, k);
        count++;
        if (count == k) {
            ans = root.data;
            return;
        }
        inorder(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        inorder(root, 3);
        System.out.println(ans);
    }
}
