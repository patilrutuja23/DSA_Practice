import java.util.Scanner;

public class CircularQueue 
{
    int[] arr;
    int size;
    int front = -1;
    int rear = -1;

    public CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
    }
    public boolean isEmpty() {
        if(rear == -1 && front == -1 ) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull() {
        if ((rear+1) % size == front ) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int data) {
        if(isFull()) {
            System.out.println("Queue is full...");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rear = (rear+1) % size;
        arr[rear] = data;
    }
 
    public int remove() {
       if(isEmpty()) {
            System.out.println("Queue is underflow...");
            return -1;
        }
        int result = arr[front];
        if(rear == front) {
            rear = front = -1;
        }
        else {
            front = (front+1) % size;
        }
        return result;

    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is underflow...");
            return -1;
        }
        return arr[front];
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue is underflow...");
            return ;
        }
        for(int i = front; i<=rear; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue: ");
        int size = sc.nextInt();
        
        CircularQueue q = new CircularQueue(size);
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
