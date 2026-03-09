
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Singly {
    static void printList(Node first){
        if(first==null){
            System.out.print("List is empty");
        }
        
        else{
            while(first!=null){
                System.out.print(first.data);
                first=first.next;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node first=null;
        Node last = null;
        int a=sc.nextInt();
        while(a!=-1){
            Node temp=new Node(a);
            if(first==null){
                first=temp;
                last=temp;
            }
            else{
                last.next=temp;}
                last=temp;
            a=sc.nextInt();
        }
        printList(first);
    }
}
