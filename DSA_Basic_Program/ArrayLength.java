import java.util.*;
public class ArrayLength 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array size: ");
        int size=sc.nextInt();
        System.out.println("String Array Elements: ");
        String[] arr=new String[size];
        int length=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.next();
            length+=arr[i].length();
        }
        System.out.println("Length is: "+length);
    }
}
