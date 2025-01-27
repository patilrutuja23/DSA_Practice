
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{12,34,6,34}, 
                        {224,7,46,45},
                        {44,78,45,90}};
        int[] ans = find(arr, 7);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] find(int[][] arr, int target) {
        if(arr.length == 0) {
            return new int[] {-1,-1};
        }
        for(int r=0; r<arr.length; r++) {
            for(int c=0; c<arr.length; c++) {
                if(target == arr[r][c]) {
                    return  new int[] {r,c};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
