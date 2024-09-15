package LINKEDLIST;

import java.util.Stack;

public class LL{
    public int size=0;
    public Node head = new Node(0, null); //initializing a head node
    public void add(int data){
        Node node =new Node(data, null); //making a new node to insert // adding value to that node        // initializing th e next node
        if(size==0){ // if it is the first node
            head=node;
            size++; // then we make it the head
        }
        else{ //or else we travel to the end of the LL
            Node n=head; //BY a temporary node pointer
            while(true){  // reaching   the second last node;
                if(n.next==null) break;
                n=n.next;
            }
            n.next=node; //change the value of null once you reah the end 
            size++;
        }
    }

    // ************ SHOWING THE ENTIRE LL ***********************//
    public void show(){
        Node n=head; // creating a temporary node to travel
        while(true){ // start traveling
            System.out.print(n.value+"-->"); // printing value of each node we travel to
            if(n.next==null) break;
            n=n.next; // moving to next node
        }
        System.out.println("END"); // and printing last data not printing just a null when we reach end
    }

    //*************INSERT AT THE START OR MAKING A NEW HEAD********************************//
    public void insertAtStart(int data){
        Node n= new Node(data, head); // creat a new node object
        n.value=data; //put its value
        n.next=head; // pass to it the next location of privious node
        head=n; // make head = new node;
        size++;
    }

    //***********************INSERTING AT A POINT**********************************************//
    public void insertAt(int index, int data){
        if(index==0){insertAtStart(data);} // if it wants to insert at start just call the insert at start functtion
        else{Node n= new Node(data, null);// creating a new node 
        n.value=data; //put the value of the node according to the daata passed in the funtion
        n.next=null; //put its next to null
        Node n1= new Node(data, null); // creat a temporary node as a pointer
        for(int i=0; i<index-1 ; i++){ //travell to the second last place
            n=n.next;
        }
        n.next=n1.next; //give the last element address to our inserted node
        n1.next=n;} // idk why i did this but it works
        size++;
    }

    //***********************DELETE A NODE******************************************************//
    public void deleteAt(int index){
        if(index>size){
            System.out.println("SUCH INDEX DOESNOT EXIST");
        }
        else if(index==0){
            head=head.next;
            size--;
        }
        else{
            Node n=new Node(0, null); //this node is gonna be at first
            Node n1=new Node(0, null); // ye wala uske agge wale index pe
            n=head; // begin here
            for(int i =0; i<index-1 ; i++){ // travell n to second last and n1 to the element we gotta delete
                n=n.next;
                n1=n.next;
            }
            n.next=n1.next; //shift the location
            size--;
        }
    }

    //*******************REVERSE using stack*************************************//
    public void reverseIlterative(){
         //initialize 3 nodes starting from head
        if(head==null || head.next==null) return;
        Node pre=head;
        Node curr=head.next;
        while(curr!= null){
            Node nextNode=curr.next;
            curr.next=pre;
            //update
            pre =curr;
            curr= nextNode;
        }
        head.next=null;
        head=pre;
    }

}