
import java.util.*;
public class StackTop 
{
    static int[] stack;
    static int first=-1;
    static int max;
    static int val;
    public static void push(int data)
    {
        if(first==max-1)
        {
            System.out.println("Stack is Overflow you can not insert element...");
            return;
        }
        first+=1;
        for(int i=first; i>0; i--)
        {
            stack[i]=stack[i-1];
        }
        stack[0]=data;
    }
    //to delete topmost element
    public static int pop()
    {
        if(first==-1)
        {
            System.out.println("Stack is underflow first insert elements in stack");
            return -1;
        }
        val=stack[0];
        for(int i=0; i<first; i++)
        {
            stack[i]=stack[i+1];
        }
        first-=1;
        return val;
    }
    public static void print()
    {
        
        if(first==-1)
        {
            System.out.println("Stack is underflow first insert elements in stack");
            return;
        }
        for(int i=0;i<=first;i++)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.err.print("Enter size of stack: ");
        max = sc.nextInt();
        stack=new int[max];
        while (true) 
        { 
            System.out.println("1. To Enter element at top(stack[0])");
            System.out.println("2. To delete element at top");
            System.out.println("3. To see Stack");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1: 
                        System.out.println("Enter element to be inserted");
                        int data=sc.nextInt();
                        push(data);
                        System.out.println("Element inserted successfully");
                        break;
                case 2:  
                        int pop=pop();
                        System.out.println("Deleted element is  "+pop);
                        break;
                case 3: print();
                        break;
                case 4: 
                        System.out.println("Exiting from program");
                        return;
                default:
                        System.out.println("Enter valid choice");

            }
        }
        
    }
}
