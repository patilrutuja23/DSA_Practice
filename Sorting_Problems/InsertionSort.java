import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] arg) {
        int[] arr = {23,56,1,45,9,34,56,79,-56,-89};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
