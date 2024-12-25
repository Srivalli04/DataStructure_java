import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class SpiralOrderTraversal 
{

    public static void spiralOrderTraversal(TreeNode root) 
    {
        if (root == null) return;

        Stack<TreeNode> stack1 = new Stack<>(); 
        Stack<TreeNode> stack2 = new Stack<>(); 

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) 
        {
           
            while (!stack1.isEmpty()) 
            {
                TreeNode node = stack1.pop();
                System.out.print(node.val + " ");

               
                if (node.left != null) stack2.push(node.left);
                if (node.right != null) stack2.push(node.right);
            }

           
            while (!stack2.isEmpty()) 
            {
                TreeNode node = stack2.pop();
                System.out.print(node.val + " ");

                if (node.right != null) stack1.push(node.right);
                if (node.left != null) stack1.push(node.left);
            }
        }
    }

    public static void main(String[] args) 
    {
       
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Spiral Order Traversal:");
        spiralOrderTraversal(root);
    }
}
