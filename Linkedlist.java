// for insertion we prefer linked list
// for searching we use arraylist 
import java.util.*;


public class Linkedlist {
    Node head=null;
    Node currNode;
    
    class Node{
        int data;
        Node next;
        

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){

        Node newNode =  new Node(data);
        if(head == null){
            head = newNode;
            currNode = newNode;
            return;
        }

        // newNode.next = head;
        // head = newNode;
        currNode.next = newNode;
        currNode = newNode;
    }

    public void addLast(int data){
        Node newNode =  new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
            head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
       // int value;
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        System.out.println("Enter the no.of nodes you want to create");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int value = sc.nextInt();
        list.addFirst(value);
        }
        list.addLast(2);
        list.deleteLast();
        list.deleteFirst();
        list.printlist();
        sc.close();
    }
}
