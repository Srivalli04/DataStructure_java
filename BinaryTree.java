import java.util.*;
public class Main
{
    static class Node 
    {
        int item;
        Node left;
        Node right;

        public Node(int item) 
        {
           this.item = item;
           this.left = null;
           this.right = null;
        }
    }
    Node root;
 void addNode(int item)
 {
     root=addRecursive(root,item);
 }
  Node addRecursive(Node root, int item) {
        if (root == null) 
        {
            return new Node(item);
        } 
        if (item < root.item)
        {
            root.left = addRecursive(root.left, item);
        } 
        else if (item > root.item) {
            root.right = addRecursive(root.right, item);
        }

        return root;
    }
   
void preorderTraversal(Node root) 
       {
        if (root == null)
        {
            return;
        }
        System.out.print(root.item + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
void inorderTraversal(Node root)
{
    if(root==null)
    {
        return;
    }
    inorderTraversal(root.left);
    System.out.print(root.item+ " ");
    inorderTraversal(root.right);
}
void postorderTraversal(Node root)
{
        if(root==null)
        {
        return;
        }  
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.item+ " ");
       
    }
public static void main(String[] args) 
{
    Main tree = new Main();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(2);
        tree.addNode(4);
        tree.addNode(7);
        tree.addNode(6);
        tree.addNode(8);
       System.out.print("Preorder: ");
        tree.preorderTraversal(tree.root);
        System.out.println();
         System.out.print("Inorder: ");
        tree.inorderTraversal(tree.root);
        System.out.println();
         System.out.print("Postorder: ");
        tree.postorderTraversal(tree.root);
    }
}

