import java.util.*;

public class MaxMinInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] num = new int[size];
        for (int i = 0; i < size; i++) 
        {
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) 
        {
            if (num[i] < min) 
            {
                min = num[i];
            }
            if (num[i] > max) 
            {
                max = num[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
