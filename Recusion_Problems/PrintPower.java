import java.util.*;
public class PrintPower //print number like n^x with stck heigh=n
{
    public static int printPower(int n,int x)
    {
        if(n==0)
        {
            return 0;
        }
        if(x==0)
        {
            return 1;
        }
        int num=printPower(n, x-1);
        int nPowx = n*num;
        return nPowx;
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
