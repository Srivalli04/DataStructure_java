class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class FlattenBinaryTree 
{
    public static void flatten(TreeNode root) 
    {
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

       root.right=prev;
       root.left=null;
       prev=root;
    }
    public static void printLinkedList(TreeNode root) 
    {
        TreeNode current = root;
        while (current != null) 
        {
            System.out.print(current.val + " -> ");
            current = current.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) 
    {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        System.out.println("Original Binary Tree:");
        printLinkedList(root);
        flatten(root);
        System.out.println("Flattened Binary Tree to Linked List:");
        printLinkedList(root);
    }
}
