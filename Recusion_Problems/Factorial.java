import java.util.*;
public class Factorial 
{
    // public static void factorial(int n,int factorial)
    // {
    //     if(n==1)
    //     {
    //         System.out.println("Factorial is : "+ factorial);
    //         return;
    //     }
    //     factorial*=n;
    //     factorial(n-1,factorial);
    // }


    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num =sc.nextInt();
        // factorial(num, 1);
        int x = factorial(num);
        System.out.println(x);
    }
}
