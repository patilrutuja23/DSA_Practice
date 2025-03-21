import java.util.Arrays;

public class CycleSort {
    public static void main(String[] arg) {
        int[] arr = {1,5,3,2,4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycle(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIdx = arr[i]-1;
            if(arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }        
}
