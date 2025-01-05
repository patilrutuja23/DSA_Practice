import java.util.*;
public class PrintPower1 //print number like n^x with stck heigh=logn
{
    public static int printPower(int n,int x)
    {
        if(x==0)
        {
            return 1;
        }
        if(x%2==0)
        {
            return printPower(n, x/2)*printPower(n, x/2);
        }
        else
        {
            return n*printPower(n, x/2)*printPower(n, x/2);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        System.out.print("enter power: ");
        int x=sc.nextInt();
        int output=printPower(n, x);
        System.out.println("Number is : "+output);
    }
}
