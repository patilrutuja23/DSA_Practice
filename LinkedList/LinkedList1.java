
import java.util.*;
class LinkedList1 {
    static Scanner sc = new Scanner(System.in);
    Node head;
    private class Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void addLast(int data)  {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;

    }

    public void addAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        if(pos == 0) {
            newNode.next = head;
            head = newNode;
        }

        if (pos < 0 || pos > size()) {
            System.out.println("Invalid position...");
            return;
        }
        Node curNode = head;
        for(int i=0; i< pos-1; i++) {
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
    }

    public void printList() {
        if(head==null) {
            System.out.println("List is empty....");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data+" ");
            curNode = curNode.next;
        }
        System.out.println("");
    }

    public void deleteFirst() {
        if(head==null) {
            System.out.println("List is empty....");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if(head==null) {
            System.out.println("List is empty....");
            return;
        }

        if(head.next==null) {
            head = null;
            return; 
        }
        Node secLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secLast = secLast.next;
        
        }
        secLast.next = null;

    }

    public void deleteAtPos(int pos) {
        if(head == null) {
            System.out.println("List is empty...");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        if (pos < 0 || pos >= size()) {
            System.out.println("Invalid position...");
            return;
        }
        Node curNode = head;
        for (int i = 0; i < pos-1; i++) {
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
    }

    public int size() {
        int size = 0;
        Node curNode = head;
        while(curNode != null) {
            curNode = curNode.next;
            size++;
        }
        return size; 
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1(); 

        while (true) { 
            System.out.println("1. Add element at first");
            System.out.println("2. Add element at last");
            System.out.println("3. Add element at position");
            System.out.println("4. Delete element at first");
            System.out.println("5. Delete element at last");
            System.out.println("6. Delete element at position");
            System.out.println("7. Print element in linkedlist");
            System.out.println("8. Exit");
            System.out.println("Enter the your choice");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 : 
                        System.out.print("Enter data to add in list: ");
                        int d1 = sc.nextInt();
                        list.addFirst(d1);
                        break;
                case 2 :
                        System.out.print("Enter data to add in list: ");    
                        int d2 = sc.nextInt();
                        list.addLast(d2);
                        break;
                case 3 :
                        System.out.print("Enter data to add in list: ");
                        int d3 = sc.nextInt();
                        System.out.print("Enter at which index you want to add element in list : ");
                        int index1 = sc.nextInt();
                        list.addAtPos(d3, index1);
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
                        list.printList();
                        break;
                case 8 :
                        System.out.println("Exiting from program");
                        return;
                default:
                        System.out.println("Enter valid choice...");
                        break;
            }
        }
    }
        // list.addFirst(9);
        // list.addFirst(2);
        // list.addFirst(8);
        // list.addLast(5);
        // list.addLast(6);
        // list.addLast(1);

        // list.deleteFirst();

        // list.deleteLast();

        // list.addAtPos(10, 2);
        // list.printList();
}


