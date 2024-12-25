import java.util.*;

public class Main {
    static class Node {
        int item;
        Node left;
        Node right;

        public Node(int item) {
            this.item = item;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.item + " ");

            if (current.left != null) 
            {
                q.add(current.left);
            }
            if (current.right != null) 
            {
                q.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
  
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(5);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(6);

        System.out.print("Level-order Traversal: ");
        tree.levelOrderTraversal(tree.root);
    }
}
