public class StackLL 
{
    // Node class
    public static class Node
    {
        int data;
        Node next;
        
        // Node constructor
        public Node(int data) 
        {
            this.data = data;
            this.next = null;  // Default to null, as new node has no next element yet
        }
    }

    static class Stack
    {
        static Node head;  // The head of the stack (top of the stack)
        
        // Check if the stack is empty
        static boolean isEmpty()
        {
            return head == null;
        }
        
        // Push an element onto the stack
        static void push(int data)
        {
            // Create a new node with the given data
            Node newNode = new Node(data);
            
            // If the stack is empty, the new node becomes the head (top of the stack)
            if (isEmpty())
            {
                head = newNode;
            }
            else
            {
                // Otherwise, link the new node to the current head, and update the head
                newNode.next = head;
                head = newNode;
            }
        }
        
        // Pop an element from the stack
        static int pop()
        {
            if (isEmpty())
            {
                return -1;  // Return -1 if the stack is empty
            }
            
            // Save the data from the head node (top of the stack)
            int top = head.data;
            
            // Update the head to the next node in the stack
            head = head.next;
            
            return top;
        }
        
        // Peek at the top element of the stack without removing it
        static int peek()
        {
            if (isEmpty())
            {
                return -1;  // Return -1 if the stack is empty
            }
            
            return head.data;  // Return the data of the top element
        }
        
        // Print the elements of the stack
        static void print()
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.println(temp.data);  // Print each element in a new line
                temp = temp.next;
            }
        }
        
        // Main method to test the stack functionality
        public static void main(String[] args) 
        {
            // Push elements onto the stack
            push(10);
            push(23);
            push(45);
            push(198);
            
            // Print stack elements
            System.out.println("Stack elements:");
            print();
            
            // Pop the top element
            System.out.println("Popped element: " + pop());
            
            // Print the stack after popping
            System.out.println("Stack elements after pop:");
            print();
        }
    }
}


















import java.util.Scanner;

public class StackLL 
{
    // Node class
    public static class Node
    {
        int data;
        Node next;
        
        // Node constructor
        public Node(int data) 
        {
            this.data = data;
            this.next = null;  // Default to null, as new node has no next element yet
        }
    }

    static class Stack
    {
        static Node head;  // The head of the stack (top of the stack)
        
        // Check if the stack is empty
        static boolean isEmpty()
        {
            return head == null;
        }
        
        // Push an element onto the stack
        static void push(int data)
        {
            // Create a new node with the given data
            Node newNode = new Node(data);
            
            // If the stack is empty, the new node becomes the head (top of the stack)
            if (isEmpty())
            {
                head = newNode;
            }
            else
            {
                // Otherwise, link the new node to the current head, and update the head
                newNode.next = head;
                head = newNode;
            }
        }
        
        // Pop an element from the stack
        static int pop()
        {
            if (isEmpty())
            {
                return -1;  // Return -1 if the stack is empty
            }
            
            // Save the data from the head node (top of the stack)
            int top = head.data;
            
            // Update the head to the next node in the stack
            head = head.next;
            
            return top;
        }
        
        // Peek at the top element of the stack without removing it
        static int peek()
        {
            if (isEmpty())
            {
                return -1;  // Return -1 if the stack is empty
            }
            
            return head.data;  // Return the data of the top element
        }
        
        // Print the elements of the stack
        static void print()
        {
            Node temp = head;
            if (temp == null) {
                System.out.println("Stack is empty.");
            } else {
                while (temp != null)
                {
                    System.out.println(temp.data);  // Print each element in a new line
                    temp = temp.next;
                }
            }
        }
        
        // Main method to test the stack functionality with user input
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            // Menu for user to choose operations
            while (true)
            {
                System.out.println("\nStack Operations:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Peek");
                System.out.println("4. Print Stack");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = sc.nextInt();
                
                switch (choice)
                {
                    case 1:
                        // Push operation
                        System.out.print("Enter value to push: ");
                        int valueToPush = sc.nextInt();
                        push(valueToPush);
                        System.out.println(valueToPush + " pushed to stack.");
                        break;
                    
                    case 2:
                        // Pop operation
                        int poppedValue = pop();
                        if (poppedValue == -1)
                        {
                            System.out.println("Stack is empty. Cannot pop.");
                        }
                        else
                        {
                            System.out.println("Popped value: " + poppedValue);
                        }
                        break;
                    
                    case 3:
                        // Peek operation
                        int peekValue = peek();
                        if (peekValue == -1)
                        {
                            System.out.println("Stack is empty. Cannot peek.");
                        }
                        else
                        {
                            System.out.println("Top element: " + peekValue);
                        }
                        break;
                    
                    case 4:
                        // Print Stack operation
                        System.out.println("Stack elements:");
                        print();
                        break;
                    
                    case 5:
                        // Exit program
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    
                    default:
      
