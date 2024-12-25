import java.util.*;

class Main{

    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static int countReachableNodes(TreeNode root, int maxDepth) {
        return countNodesAtDepth(root, 0, maxDepth);
    }

    private static int countNodesAtDepth(TreeNode node, int currentDepth, int maxDepth) {
        if (node == null) return 0;

        if (currentDepth > maxDepth) return 0;

        int count = 1; 
        count += countNodesAtDepth(node.left, currentDepth + 1, maxDepth);
        count += countNodesAtDepth(node.right, currentDepth + 1, maxDepth);

        return count;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left=new TreeNode(8);
        root.right.right.right=new TreeNode(9);

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maximum depth: ");
        int maxDepth = scanner.nextInt();

        int reachableNodes = countReachableNodes(root, maxDepth);
        System.out.println("Number of reachable nodes: " + reachableNodes);
    }
}
