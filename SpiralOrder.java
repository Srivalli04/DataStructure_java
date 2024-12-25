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

public class SimpleZigZagTraversal {
    public static void zigzagTraversal(TreeNode root)
     {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true; 

        while (!queue.isEmpty()) 
        {
            int levelSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) 
            {
                TreeNode node = queue.poll();

                if (leftToRight) 
                {
                    level.add(node.val);
                } 
                else 
                {
                    level.addFirst(node.val);
                }

                if (node.left != null) queue.offer(node.left);
                if (node.rig     ht != null) queue.offer(node.right);
            }

            
            System.out.println(level);
            leftToRight = !leftToRight; 
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

        System.out.println("Zigzag (Spiral) Order Traversal:");
        zigzagTraversal(root);
    }
}
