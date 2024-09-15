package TREE;
import java.util.Scanner;

public class treeUse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //initializing the scanner object
        treeNode root = Tree.createTree();
        System.out.println("INORDER");
        traversal.inOrder(root);
        System.out.println("PREORDER");
        traversal.preOrder(root);
        System.out.println("POSTORDER");
        traversal.postOrder(root);
    }
}