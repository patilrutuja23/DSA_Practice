import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,56,1,45,9,34,56,79,-56,-89};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
