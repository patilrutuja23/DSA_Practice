import java.util.*;
public class SumOfNaturalNum 
{
    public static void naturalNum(int n,int sum)
    {
        if(n==0)
        {
            System.out.println("Sum is: "+ sum);
            return;
        }
        sum+=n;
        naturalNum(n-1,sum);
    }
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to upto to you want to add numbers: ");
        int n=sc.nextInt();
        naturalNum(n,0);
    }
}
