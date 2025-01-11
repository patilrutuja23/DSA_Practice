
import java.util.ArrayList;

public class SubSeqArrayList {

    public static void main(String[] args) {
        ArrayList<String> res = sub("", "abc");
        System.out.println(res);
        int[] arr = {1,2,3};
        int target = 1;
        ArrayList<Integer> ans = findAll(arr, target, 0);
        System.out.println(ans);
        subSeqAscii("", "abc");
    }

    public static ArrayList<String> sub(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sub(p+ch, up.substring(1));
        ArrayList<String> right = sub(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    public static ArrayList<Integer> findAll(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ans = findAll(arr, target, index+1);
       
        list.addAll(ans);
        return list;
    }


    // to get with ascii value
    public static void subSeqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        
        subSeqAscii(p+ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p+(ch+0), up.substring(1));

    }


}
