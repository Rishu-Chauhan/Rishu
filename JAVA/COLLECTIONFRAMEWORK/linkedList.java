import java.util.LinkedList;

public class linkedList {
     Node head;
     class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;
        }
     }
     public void addFirst(int data){
      Node newNode=new Node(data);
      if(head==null){
        head=newNode;
        return;
      }
      newNode.next=head;
      head=newNode;
     }
     public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("null");
     }
     
     public  void change(){
        Node tail=head;
        Node prv=null;
        while (tail !=null) {
            prv=tail;
            tail=tail.next;
        }
        tail.next=head;
        prv.next=null;
        tail=head;
     }
    public static void main(String[]args){
        linkedList l=new linkedList();
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.print();
        l.change();
   
    }
}
