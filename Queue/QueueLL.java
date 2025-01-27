import java.util.*;
public class QueueLL {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     
    public boolean isEmpty() {
            if(head == null && tail == null) {
                return true;
            } else {
                return false;
            }
    }

    public void add(int data) {
        Node newNode = new Node(data);
            if(tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
    }

    public int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty... ");
                return -1;
            }
            int front = head.data;
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
    }
        
    public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty... ");
                return -1;
            }
            return head.data;
    }

    public void print() {
            if(isEmpty()) {
                System.out.println("Queue is empty... ");
                return;
            }
            Node curNode = head;
            while (curNode.next != null) { 
                System.out.print(curNode.data +" ");
                curNode = curNode.next;
            }
            System.out.println();
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        Scanner sc = new Scanner(System.in);
        while (true) {
                System.out.println("1. Add element in Queue");
                System.out.println("2. Remove element in Queue");
                System.out.println("3. Peek topmost element in Queue");
                System.out.println("4. Print element in Queue");
                System.out.println("5. Exit");
                System.out.println("Enter our choice: ");
                int choice = sc.nextInt();
    
            switch(choice) {
                    case 1 : System.out.println("Enter element to be inserted: ");
                                int data = sc.nextInt();
                                q.add(data);
                                break;
                    case 2 : q.remove();
                                break;
                    case 3 : int front = q.peek();
                                System.out.println("Front element is: " + front);
                                break;
                    case 4 : q.print();
                                break;
                    case 5 : System.out.println("Exiting from program");
                                return;
                    default : System.out.println("Enter valid choice....");
    
    
            }
        }
    }
    
}
