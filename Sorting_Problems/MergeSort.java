
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4};
        // mergeSort(arr);
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] last) {
        int[] mix = new int[first.length + last.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<first.length && j<last.length) {
            if(first[i] < last[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = last[j];
                j++;
            }
            k++;
        }
        while(i<first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<last.length) {
            mix[k] = last[j];
            j++;
            k++;
        }
        return mix;
    }






    // with inplace method
    
    public static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
        int mid = (start + end)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }
 
    public static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i< m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0; l<mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }


}
