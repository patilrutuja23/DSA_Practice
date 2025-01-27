public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {35,41,55,77,89,90};
        int target = 89;
        int res = binary(arr, target);
        System.out.println(res);

        int[] arr1 = {99,45,34,32,23,17,1};
        int target1 = 45;
        int ans = binaryDesc(arr1, target1);
        System.out.println(ans);
    }

    // Search for ascending order array
    public static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target == arr[mid]) {
                return mid;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
// Search for descending order array

    public static int binaryDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target == arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]) {
                end = mid - 1;
            }
            else if(target < arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
