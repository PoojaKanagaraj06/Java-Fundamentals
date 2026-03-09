import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Circular {

    static void printList(Node first){
       Node temp=first;
        if(temp == null){
            System.out.print("List is empty");
        }
        else{
            while(temp .next!= first){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node first = null;
        Node last = null;

        int a = sc.nextInt();

        while(a != -1){

            Node temp = new Node(a);

            if(first == null){
                first = temp;
                last = temp;
            }
            else{
                last.next = temp;
                temp.prev = last;
                temp.next=first;
            }
            last=temp;

            a = sc.nextInt();
        }

        printList(last);
    }
}