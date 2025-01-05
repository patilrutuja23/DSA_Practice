public class NtoOne {

    public static void main(String[] args) {
        num(10);
    }

    public static void num(int n) {
        
        if(n == 0) {
            return;
        }
        // from n to 1
        System.out.println(n);
        num(n-1);
        // from 1 to n
        System.out.println(n);
    }
}
