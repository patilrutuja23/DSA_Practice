public class SumProdArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,9,6,4,8};
        int n = arr.length;
        int sum = 0;
        int prod = 1;
        for(int i=0; i<n ; i++)
        {
            sum += arr[i];
            prod *= arr[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+ prod);
    }
}
