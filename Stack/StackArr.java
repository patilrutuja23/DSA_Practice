import java.util.*;
public class StackArr 
{
    static int max;
    static public int stack[];
    static int top=-1;
    static int val;
    public static void push(int data)
    {
        if(top==max-1)
        {
            System.out.println("Stack is Overflow you can not insert element...");
            return;
        }
        top+=1;
        stack[top]=data;
    }
    public static int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow first insert elements in stack");
            return -1;
        }
        val=stack[top];
        top-=1;
        return val;
    }
    public static int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow first insert elements in stack");
            return -1;
        }
        val=stack[top];
        return val;
    }
    public static void print()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow first insert elements in stack");
            return;
        }
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.err.println();
    }
    
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        max=sc.nextInt();
        stack=new int[max];
        while(true)
        {
            System.out.println("1. To Add element");
            System.out.println("2. To Delete element");
            System.out.println("3. To see Top element");
            System.out.println("4. To see Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter element to be inserted");
                    int data=sc.nextInt();
                    push(data);
                    System.out.println("Element inserted successfully");
                    break;
                case 2:
                    int pop= pop();
                    System.out.println("Deleted Element is "+pop);
                    break;
                case 3:
                    int topElement = peek();
                    System.out.println("Element at top of Stack is  "+ topElement);
                    break;
                case 4: print();
                    break;
                case 5: System.out.println("Exiting from program");
                    return;
                default : System.out.println("Enter valid choice");
            }
        }
    }
}
