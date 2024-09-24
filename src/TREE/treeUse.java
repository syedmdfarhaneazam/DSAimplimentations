package TREE;
import java.util.Scanner;

public class treeUse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //initializing the scanner object
        treeNode root = Tree.createTree();
        /****** FOR TRAVERSAL *****/
        //System.out.println("INORDER");
        //traversal.inOrder(root);
        //System.out.println("PREORDER");
        //traversal.preOrder(root);
        //System.out.println("POSTORDER");
        //traversal.postOrder(root);
        //*****Traversal Orders****/
        traversal.levelOrder(root);
        System.out.println();
        traversal.leftView(root);
        System.out.println();
        traversal.rightView(root);
        System.out.println();
        /******HEIGHT*********/
        System.out.println(Tree.height(root));
        /******SIZE***** */
        System.out.println(Tree.size(root));
    }
}