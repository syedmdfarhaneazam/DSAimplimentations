package TREE;
import java.util.Scanner;
public class Tree{
    public static treeNode createTree(){
        Scanner sc = new Scanner(System.in); //creating scanner object for input
        treeNode root= null; //creating a root that will be recursive
        System.out.println("Enter value:"); 
        int v = sc.nextInt(); //taking value
        if(v == -1) return null;
        root = new treeNode(v); //assigning the value
        //going for left value
        System.out.println("Enter "+ v +"'s left value");
        root.left = createTree();
        //going for right value
        System.out.println("Enter "+ v +"'s right value");
        root.right = createTree();
        return root;
    }
    public static int height(treeNode root){ //to calculate the max height
        if(root == null ) return 0; //base case
        return Math.max(height(root.left) , height(root.right)) +1; //to sent the funtion on either side and then add one for the fact that the current node is not null
    }
    public static int size(treeNode root){ //to calculate the total number of nodes in the  tree
        if(root == null ) return 0; //base case since we are not gonna count null nodes
        return size(root.right)+size(root.left)+1; //adding one for the current node and then sending the funtion to the either side of the node
    }
    public static int maxNode(treeNode root){
        if(root == null) return Integer.MIN_VALUE; //base case return the min value so that it gets discarded
        return Math.max(root.value , (Math.max(maxNode(root.right), maxNode(root.left)))); //return the min
    }
    public static int minNode(treeNode root){
        if (root == null) return Integer.MAX_VALUE; // base case returns the max value and gets discarded 
        return Math.min(root.value , (Math.min(minNode(root.right), minNode(root.left)))); //returns the min value between left right and the current node
    }
}