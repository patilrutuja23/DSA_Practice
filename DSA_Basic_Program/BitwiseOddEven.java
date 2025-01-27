
import java.util.Scanner;


public class BitwiseOddEven
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        if(oddeven(a))
            System.out.println("Odd Number");
        else
            System.out.println("Even Number");
    }
    static boolean oddeven(int n)
    {
        return (n & 1)== 1;
    }
}





// import java.util.Scanner;

// public class BitwiseNum 
// {
//     static int max=100;
//     static public int[] stack=new int[max];
//     static int top=-1;
//     static int val;
//     static boolean isFull()
//     {
//         return top==max-1;
//     }
//     static boolean isEmpty()
//     {
//         return top==-1;
//     }
//     public static void push(int data)
//     {
//         if(isFull())
//         {
//             System.out.println("Stack is Overflow you can not insert element...");
//             return;
//         }
//         top++;
//         stack[top]=data;
//     }
//     public static int pop()
//     {
//         if(isEmpty())
//         {
//             System.out.println("Stack is underflow first insert elements in stack");
//             return -1;
//         }
//         val=stack[top];
//         top--;
//         return val;
//     }
//     public static void print()
//     {
//         if(isEmpty())
//         {
//             System.out.println("Stack is underflow first insert elements in stack");
//             return;
//         }
//         while(!isEmpty())
//         {
//             System.out.print(pop());
//         }
//     }
//     public static void decToBinary(int data)
//     {
        
//             while(data!=0)
//             {
//                 push(data%2);
//                 data/=2;
//             }
//     }
    
//     public static void main(String[] args) 
//     {
//         Scanner sc =new Scanner(System.in);
//         System.err.println("Enter number");
//         int data=sc.nextInt();
//         decToBinary(data);
//         print();
//     }
// }
