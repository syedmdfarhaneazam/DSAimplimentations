package LINKEDLIST;
public class Node {
     int value;
     Node next;
     Node prev;
     public Node(int value, Node next){
        this.value=value;
        this.next=next;
     }
     public Node(int value, Node next, Node prev){
        this.value=value;
        this.next=next;
        this.prev=prev;
     }
}