import java.util.Scanner;

class QueueArr {
    static int[] arr;
    static int size;
    static int rear = -1;
    static Scanner sc = new Scanner(System.in);

    QueueArr(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if(rear == -1)
            return true;
        else
            return false;
    }

    public void add(int data) {
        if(rear == size-1) {
            System.out.println("Queue is full...");
            return;
        }
        rear ++;
        arr[rear] = data;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty...");
            return 0;
        }
        int front = arr[0];

        for(int i=0; i<rear; i++) {
            arr[i] = arr[i+1];
        }
        rear --;
        return front;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty...");
            return -1;
        }
        return arr[0];
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] arg) {
        
        System.out.println("Enter size of queue: ");
        int size = sc.nextInt();
        
        QueueArr q = new QueueArr(size);
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