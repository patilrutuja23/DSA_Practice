public class CountZero {

    public static void main(String[] args) {
        int num = count(1002003);
        System.out.println(num);
    }


    public static int count(int n) {
        return countNum(n, 0);
    }

    public static int countNum(int n, int count) {
        if(n==0) {
            return count; 
        }
        int rem = n%10;
        if(rem == 0) {
            return countNum(n/10, count+1);
        }  
        return countNum(n/10, count);
    }
}
