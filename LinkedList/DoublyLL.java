
import java.util.Scanner;

class DoublyLL {

    static Scanner sc = new Scanner(System.in);
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }


    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;

        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;

        if(tail == null) {
            tail = newNode;
        }
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
// using tail node in doubly linkedlist 
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        // without using tail node
        // Node curNode = head;
        // while(curNode.next != null) {
        //     curNode = curNode.next;
        // }
        // curNode.next = newNode;
        // newNode.next = null;
    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if(pos == 0) {
            newNode.next = head;
            if(head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        if(pos > size() || pos < 0) {
            System.out.println("Invalid position to insert element");
            return;
        }

        Node curNode = head;
        for(int i=0; i< pos-1; i++) {
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        newNode.prev = curNode;

        if(curNode.next != null) {
            curNode.next.prev = newNode;
        }
        curNode.next = newNode;

        if(newNode.next == null) {
            tail = newNode;
        }
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty....");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("List is empty....");
            return;
        }
        if(head.next == null) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;

    }

    public void deleteAtPos(int pos) {
        if(head == null) {
            System.out.println("List is empty....");
            return;
        }
    
        if(pos < 0 || pos >= size()) {
            System.out.println("Invalid Position to delete element");
            return;
        }
    
        if(pos == 0) {
            deleteFirst();
            return;
        }
    
        Node curNode = head;
        for(int i = 0; i < pos; i++) {
            curNode = curNode.next;
        }
    
        
        if(curNode == tail) {
            tail = curNode.prev;
            tail.next = null;
        } else {
            curNode.prev.next = curNode.next;
            curNode.next.prev = curNode.prev;
        }
    
        curNode = null; 
    }
    

    public void printDLL() {
        if(head == null) {
            System.out.println("List is empty....");
            return;
        }  

        Node curNode = head;
        while(curNode != null) {
            System.out.print(curNode.data +" ");
            curNode = curNode.next;
        }
        System.out.println();
    }
    
    public void printReverse() {
        if(head == null) {
            System.out.println("List is empty....");
            return;
        } 

        System.out.println("Reverse LIst is :");
        Node curNode = head;

        while (curNode != null && curNode.next != null) {
            curNode = curNode.next;
        }

        while(curNode != null) {
            System.out.print( curNode.data+" ");
            curNode = curNode.prev;
        }
        System.out.println();
    }

    public int size() {
        int size = 1;
        Node curNode = head; 
        while(curNode != null) {
            size++;
            curNode = curNode.next;
        }
        return size;
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        while (true) { 
            System.out.println("1. Add element at first");
            System.out.println("2. Add element at last");
            System.out.println("3. Add element at position");
            System.out.println("4. Delete element at first");
            System.out.println("5. Delete element at last");
            System.out.println("6. Delete element at position");
            System.out.println("7. Print element in linkedlist");
            System.out.println("8. Print element in linkedlist");
            System.out.println("9. Exit");
            System.out.println("Enter the your choice");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 : 
                        System.out.print("Enter data to add in list: ");
                        int d1 = sc.nextInt();
                        list.insertFirst(d1);
                        break;
                case 2 :
                        System.out.print("Enter data to add in list: ");    
                        int d2 = sc.nextInt();
                        list.insertLast(d2);
                        break;
                case 3 :
                        System.out.print("Enter data to add in list: ");
                        int d3 = sc.nextInt();
                        System.out.print("Enter at which index you want to add element in list : ");
                        int index1 = sc.nextInt();
                        list.insertAtPos(d3, index1);
                        break;
                case 4 :
                        list.deleteFirst();
                        break;
                case 5 :
                        list.deleteLast();
                        break;
                case 6 :
                        System.out.print("Enter at which index you want to delete element in list : ");
                        int index2 = sc.nextInt();
                        list.deleteAtPos(index2);
                        break;
                case 7 :
                        list.printDLL();
                        break;
                case 8 :
                        System.out.println("Size of doubly linkedlist is: "+ list.size());
                case 9 :
                        System.out.println("Exiting from program");
                        return;
                default:
                        System.out.println("Enter valid choice...");
                        break;
            }
        }
                
    }
}
