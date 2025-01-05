public class ReverseNum {
    public static void main(String[] args) {
        int num = rev(1212);
        System.out.println(num);
    }

    // static int sum = 0;

    // public static void reverse(int n) {
    //     if(n == 0) {
    //         return;
    //     }
        
    //     int rem = n%10;
    //     sum = sum*10 + rem;
    //     reverse(n/10);
    // }


    public static int rev(int n) {
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }

    public static int helper(int n, int digit) {
        if(n%10 == n) {
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digit-1)) + helper(n/10, digit-1);
    }
    
}
