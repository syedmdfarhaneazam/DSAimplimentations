package LINKEDLIST;
import java.util.Scanner;
public class LLuse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LL d=new LL();
        System.out.println("ENTER THE NUMBER OF ELEMENT YOU WANNA ADD");
        int l=sc.nextInt();
        System.out.println("ENTER THE DATA YOU WANNA ADD");
        for(int i=0;i<l;i++){
            int data=sc.nextInt();
            d.add(data);
        }
        d.show();
        // LL d2= new LL();
        // Node n=d.head;
        // for(int i=0;i<l;i++){
        //     d2.insertAtStart(n.value);
        //     n=n.next;
        // }
        // d2.show();
        d.reverseIlterative();
        d.show();
    }
}