import java.util.*;
public class IfSortedArray 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements of array: ");
        int[] num= new int[size];
        boolean isSortedArray= true;
        for (int i = 0; i < size; i++) 
        {
            num[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(num[i]);
        }
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]>num[i+1])
            {
                isSortedArray= false;
            }
        }
        if(isSortedArray)
        {
            System.out.println("Array is Sorted in ascending order");
        }
        else
        {
            System.out.println("Array is not Sorted in ascending order");
        }
    }
}
