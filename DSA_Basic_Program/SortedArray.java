import java.lang.reflect.Array;
import java.util.*;
public class SortedArray 
{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
    }
}
