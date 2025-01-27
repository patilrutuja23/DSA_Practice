
import java.util.ArrayList;

public class LetterCombination {

    public static void main(String[] args) {
        pad("", "12");
        ArrayList<String> l = padList("", "12");
        System.out.println(l);
    }

    static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i =(digit-1)*3; i<digit*3; i++) {
            char ch = (char)(i+'a');
            pad(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> padList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>(); 
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i =(digit-1)*3; i<digit*3; i++) {
            char ch = (char)(i+'a');
            ArrayList<String> list1 = padList(p+ch, up.substring(1));
            list.addAll(list1);
        }
        return list;
    }
}
