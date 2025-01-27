import java.util.*;
public class PrimeFactors 
{
    static int max=1000;
    static public int[] stack=new int[max];
    static int top=-1;
    static int val;
    static boolean isFull()
    {
        return top==max-1;
    }
    static boolean isEmpty()
    {
        return top==-1;
    }
    public static void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is Overflow you can not insert element...");
            return;
        }
        top++;
        stack[top]=data;
    }
    public static int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is underflow first insert elements in stack");
            return -1;
        }
        val=stack[top];
        top--;
        return val;
    }
    public static void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack is underflow first insert elements in stack");
            return;
        }
        while(!isEmpty())
        {
            System.out.print(pop()+" ");
        }
    }
    public static void primeFactor(int data)
    {
        int i=2;
        while(data!=1)
        {
            while(data%i==0)
            {
                push(i);
                data =data/i;
            }
            i++;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        int data=sc.nextInt();
        primeFactor(data);
        print();
    }
}
