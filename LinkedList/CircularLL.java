
import java.util.Scanner;

public class CircularLL {

    static Scanner sc = new Scanner(System.in);
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void inserLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        Node curNode = head;
        while(curNode.next != head) {
            curNode = curNode.next; 
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public void delete(int pos) {
        if(pos == 0) {
            if(tail == head) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        if(pos<0 || pos>size()-1) {
            System.out.println("Invalid position to delete element");
            return;
        }

        Node curNode = head;
        for(int i = 0; i < pos-1; i++) {
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;

        if (curNode.next == head) { 
            tail = curNode;
        }
    } 

    public boolean search(int key) {
        if(head == null) {
            return false;
        }

        Node curNode = head;
        do { 
            if(curNode.data == key) {
                return true;
            }
            curNode = curNode.next;
        } while (curNode != head);

        return false;
    }

    public Node getNode(int node) {
        if(head == null || node <= 0) {
            return null;
        }

        Node curNode = head;
        int count = 1;
        do { 
            if(count == node) {
                return curNode;
            }
            count ++;
            curNode = curNode.next;
        } while (curNode != head);

        return null;
    }

    public void printList() {
        Node curNode = head;
        if (head != null) {
            do {
                System.out.print(curNode.data + "->");
                curNode = curNode.next;
            } while (curNode != head);
        }
        else {
            System.out.println("List is empty");
        }
        System.out.println();
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        
        int size = 1;
        Node curNode = head.next;
        while (curNode != head) {
            size++;
            curNode = curNode.next;
        }
        
        return size;
        
    }
    
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        while (true) { 
            System.out.println("1. Add element at first");
            System.out.println("2. Add element at last");
            System.out.println("3. Delete element at position");
            System.out.println("4. Print element in Circular linkedlist");
            System.out.println("5. Print size of element in Circular linkedlist");
            System.out.println("6. Exit");
            System.out.println("Enter the your choice");
            int choice = sc.nextInt();

            switch(choice) {
                case 1 : 
                        System.out.print("Enter data to add in list: ");
                        int d1 = sc.nextInt();
                        list.insert(d1);
                        break;
                case 2 :
                        System.out.print("Enter data to add in list: ");    
                        int d2 = sc.nextInt();
                        list.inserLast(d2);
                        break;
                case 3 :
                        System.out.print("Enter at which index you want to delete element in list : ");
                        int index2 = sc.nextInt();
                        list.delete(index2);
                        break;
                        
                case 4 :
                        list.printList();
                        break;
                case 5 :
                        System.out.println("Size of circular linkedlist is: "+ list.size());
                        break;
                case 6 :
                        System.out.println("Exiting from program");
                        return;
                default:
                        System.out.println("Enter valid choice...");
                        break;
            }
        }
    }
}




















    

    

    
//     // Reverse the circular linked list
//     public void reverse() {
//         if (head == null || head.next == head) return;
        
//         Node prev = null, current = head, next = null;
//         do {
//             next = current.next;
//             current.next = prev;
//             prev = current;
//             current = next;
//         } while (current != head);
        
//         head.next = prev;
//         head = prev;
//     }
    
