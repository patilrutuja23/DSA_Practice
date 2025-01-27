import java.util.*;
public class ArrayName 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter elements of array: ");
        String name[]=new String[size];
        for(int i=0;i<size;i++)
        {
            name[i]=sc.next();
        }
        for(int i=0;i<name.length;i++)
        {
            System.out.println("name "+(1+i)+" is "+name[i]);
        }
    }
}
