import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int x = fibonacci(num);
        System.out.println("Fibonacci number at position " + num + " is: " + x);
    }

    public static int fibonacci(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
