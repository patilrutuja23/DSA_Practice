public class BinarySearchRec {

    public static void main(String ar[]) {
        int[] arr ={12,34,65,75,97,99};
        int target = 65;
        int ans = binary(arr, target, 0, arr.length-1);
        System.out.println("Index is:" +ans);
    }

    public static int binary(int arr[], int target, int start, int end) {
        
        int mid = start + (end-start) /2;

        if (start > end) {
            return -1;
        }

        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            return binary(arr, target, start, mid-1);
        }
        return binary(arr, target, mid+1, end);
    }

}
