// import static java.lang.Integer.*;

// public class SwapMaxMinArray {
//     public static void main(String[] args) {
//         int[] arr = {3, 2, 5, 6, 9, 2, 1};
//         int n = arr.length;
        
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         int maxIndex = -1; 
//         int minIndex = -1;

//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//                 maxIndex = i;
//             }
//             if (arr[i] < min) {
//                 min = arr[i];
//                 minIndex = i;
//             }
//         }

//         System.out.println("Original array:");
//         printArray(arr);

//         swap(arr, maxIndex, minIndex);

//         System.out.println("Array after swapping max and min:");
//         printArray(arr);
//     }

//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void printArray(int[] arr) {
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//         System.out.println();
//     }
// }


import static java.lang.Integer.*;

public class SwapMaxMinArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 9, 2, 1};
        int n = arr.length; 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        int minIdx = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
                maxIdx = i; 
            }
            if(arr[i]<min){
                min = arr[i];
                minIdx = i; 
            }
        }
        System.out.print("Original Array is: ");
        print(arr);
        swap(arr, minIdx, maxIdx);
        System.out.print("After swaping max and min Array is: ");
        print(arr);
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}