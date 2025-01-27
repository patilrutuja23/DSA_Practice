public class Ceiling {
    public static void main(String[] arg) {
        int[] arr = {1,3,5,7,8,14,16,18};
        int target = 18;
        int ans = ceiling(arr, target);
        System.out.println(ans);
        int res = floor(arr, target);
        System.out.println(res);
    } 
    public static int ceiling(int[] arr, int target) {
        if(target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

    public static int floor(int[] arr, int target) {
        if(target > arr[arr.length-1]) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
