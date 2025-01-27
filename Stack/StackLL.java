public class StackLL 
{
    static Node head;
    public static class Node()
    {
        int data;
        Node next;
        public Node(int data) 
        {
            this.data = data;
            this.next = null;
        }

    }
    static boolean isEmpty()
        {
            return head==null;
        }
        static void push(int data)
        {
            Node newNode =new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
        static void print()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }
    
        
        
        public static void main(String[] args) 
        {
            push(10);
            push(23);
            push(45);
            push(198);
            System.out.println("Stack element ");
            print();
            System.out.println("popped elemet"+pop());
            System.out.println("Stack element ");
            print();
        }
}
