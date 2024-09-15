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
}