package LINKEDLIST;
public class DLL {
    public Node tail= new Node(0, null, null);
    public Node head= new Node(0, null, null);
    public int size=0;

    //**************TO INSERT AT FIRST************************* */
    public void insertAtFirst(int data){
        Node newNode = new Node(data, null, null); //new node to insert
        if(size==0){tail=newNode;} //put tail is new node if the ll is enpty
        head.prev=newNode; //point the null value of previous of head to the new node
        newNode.next=head; //now show that head comes after our new node
        head=newNode; //pass the nead node name to our new node
        size++; //increment the size
    }

    //**************TO DISPLAY THE LL****************//
    public void display(){
        Node pointer=new Node(0, null, null); // make a pointer to travel 
        pointer=head; //place the pointer to the head
        while(pointer.next!=null){ // now travel untill you reach the end
            System.out.print(pointer.value +"==>");
            pointer=pointer.next; //shift the pointer to next node
        }
        System.out.println(pointer.value+"==>END");
    }

    //**************TO ADD AT THE END**************/
    public void add(int data){
        if (size==0){ insertAtFirst(data);} //checl if its the first node and call the function to insert at first
        else{
            Node node= new Node(data, null, null); // creat a new node obj
            node.prev=tail; //initialize its previous to tail
            tail.next=node; //point the nesxt of the tail to the new node
            tail=node; //make the new node as the tail
            size++; // increement the size
        }
    }

    //**************TO DELETE A NODE*****************/
    public void deleteAt(int index){
        if((size==0)||(index>size-1)){ //TO CHECK IF THE INDEX IS OUT OF BOUND
            System.out.println("THERE IS NO SUCH INDEX OR YOUR LIST MUST BE EMPTY");
        }
        else if(index==0){
            head=head.next;
            head.prev=null;
        }
        else if(index==size-1){
            tail=tail.prev;
            tail.next=null;
        }
        else{
            Node newNode1=head;
            
            while(index-1!=0){
                newNode1=newNode1.next;
                index--; 
            }
            Node newNode2=newNode1.next;
            newNode2=newNode2.next;
            newNode2.prev=null;
            newNode1.next=newNode2;
            newNode2.prev=newNode1;
        }
    }
}
