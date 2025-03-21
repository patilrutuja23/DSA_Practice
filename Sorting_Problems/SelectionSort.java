import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {23,56,1,45,9,34,56,79,-56,-89};
        selection(arr);
        selection1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int last = n-i-1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
    }

    public static int getMax(int[] arr, int start, int end) {
        int max = start;
        for(int i=start; i<=end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }



    public static void selection1(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    swap(arr, j, i);
                }
            }
        }
    }

}
