package TREE;

//class specifically for traversal
public class traversal{
    public static void inOrder(treeNode root){ //in order traversal LEFT - NODE - RIGHT printing partern
        if (root == null) return; //base case
        inOrder(root.left); //first going left if root is not null
        System.out.println(root.value); // if left was null the printing the node value
        inOrder(root.right); //then going to the right
    }
    public static void preOrder(treeNode root){ //pre order traversal NODE - LEFT - RIGHT printng partern
        if (root == null) return; //base case
        System.out.println(root.value); // if node is not  null then printing its value
        preOrder(root.left); // then going to the left node
        preOrder(root.right); //then going to the right node
    }
    public static void postOrder(treeNode root){ //post order traversal LEFT - RIGHT - NODE printing partern
        if (root == null) return; //base case
        postOrder(root.left); //if not null then going to the left
        postOrder(root.right); //then going to the right 
        System.out.println(root.value); //then printing the node itself
    }
}