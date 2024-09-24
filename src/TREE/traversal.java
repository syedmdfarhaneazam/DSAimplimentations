package TREE;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList; 

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
    public static void postOrder(treeNode root){ //post order traversal LEFT - RIGHT - NODE printing partern O(n*n)
        if (root == null) return; //base case
        postOrder(root.left); //if not null then going to the left
        postOrder(root.right); //then going to the right 
        System.out.println(root.value); //then printing the node itself
    }
    public static void levelOrder(treeNode root){ //this funtion print by level
        for(int i = 0 ; i<= Tree.height(root) ; i++){
            thisLevelOrder(root,i);
        }
    }
    public static void thisLevelOrder(treeNode root , int level){ //this one prints each level
        if(root == null)  return ; //base case
        if(level == 1){
            System.out.print(root.value+" ");
        }
        else if(level>1){
            thisLevelOrder(root.left, level -1);
            thisLevelOrder(root.right, level -1);
        }
    }
    public static void levelOrderQueue(treeNode root){ // uses queue data structure , it stores right and left of a node and pops the exixting node O(n)
        Queue<treeNode> q = new LinkedList<>(); // initializing the queue
        q.add(root); //putting the node int the queue
        while(!q.isEmpty()){ //base case
            treeNode current = q.poll(); //delets the first node in the element
            System.out.print(current.value); // prints the delted node
            if(current.left!=null){
                q.add(current.left); //added new level to the queue
            }
            if(current.right != null){
                q.add(current.right); // added new level to the queue
            }
        }
    }
    /**********************************LEFT - RIGHT VIEWS BLOCK**************************************/
    public static void printLeftView(treeNode root, ArrayList<treeNode> l, int level){ 
        if (root == null) return; // base case
        if (l.size() == level) { // check if the list has an element at this level
            l.add(root); // add the current node to the list
        }
        printLeftView(root.left, l, level + 1); // recurse for the left subtree
        printLeftView(root.right, l, level + 1); // recurse for the right subtree
    }
    
    public static void printRightView(treeNode root, ArrayList<treeNode> l, int level){ 
        if (root == null) return; // base case
        if (l.size() == level) { // check if the list has an element at this level
            l.add(root); // add the current node to the list
        }
        printRightView(root.right, l, level + 1); // recurse for the right subtree
        printRightView(root.left, l, level + 1); // recurse for the left subtree
    }
    
    public static void leftView(treeNode root){//by hashmap or array o(n) both space complexity is same 
        ArrayList<treeNode> l = new ArrayList<>();
        printLeftView(root , l , 0);
        for(treeNode current : l) System.out.println(current.value+" ");
    }
    public static void rightView(treeNode root){//by hashmap or array o(n) both space complexity is same 
        ArrayList<treeNode> l = new ArrayList<>();
        printRightView(root , l , 0);
        for(treeNode current : l) System.out.println(current.value+" ");
    }
    /******************************TOP - BOTTOM VIEW*********************** */
    public static void topView(treeNode root){
        
    }
    public static void bottomView(treeNode root){
         
    }
}