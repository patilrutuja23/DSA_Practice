
import java.util.*;
public class IfSorted 
{
    public static boolean ifSorted(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(!ifSorted(arr, index+1))
        {
            return false;
        }
        return arr[index]<arr[index+1];
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size ");
        int size= sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(ifSorted(arr, 0))
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
