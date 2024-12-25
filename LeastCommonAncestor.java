class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class LowestCommonAncestor {
    public static TreeNode findLCA(TreeNode root, int node1, int node2) {
        if (root == null) 
        {
            return null;
        }
        if (root.value == node1 || root.value == node2) 
        {
            return root;
        }
        TreeNode leftLCA = findLCA(root.left, node1, node2);
        TreeNode rightLCA = findLCA(root.right, node1, node2);

        if (leftLCA != null && rightLCA != null)
        {
            return root;
        }
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        int node1 = 5;
        int node2 = 4;

        TreeNode lca = findLCA(root, node1, node2);

        if (lca != null) 
        {
            System.out.println("Lowest Common Ancestor of " + node1 + " and " + node2 + " is: " + lca.value);
        } 
        else 
        {
            System.out.println("One or both nodes are not present in the tree.");
        }
    }
}
