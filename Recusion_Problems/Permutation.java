import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {
        String input = "abc"; 
        permutation("", input);
        int count = permutationCount("",input);
        System.out.println("With duplicate character "+count);

        Set<String> seen = new HashSet<>();
        int c = permutationCountDuplicate("",input,seen);
        System.out.println("Without duplicate "+c);

        ArrayList<String> result = permutationList("", "abc");
        System.out.println(result);
    }

    static void permutation(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String end = p.substring(i);
            permutation(start+ch+end, up.substring(1));
        }
    }

    static int permutationCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }
        int count = 0; 
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String end = p.substring(i);
            count = count + permutationCount(start+ch+end, up.substring(1));
        }
        return count;
    }

    static int permutationCountDuplicate(String p, String up,Set<String> seen) {
        if(up.isEmpty()) {
            return 1;
        }
        int count = 0; 
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String end = p.substring(i);

            String newPermutation = start+ch+end;

            if(!seen.contains(newPermutation)) {
                seen.add(newPermutation);
                count = count + permutationCountDuplicate(start+ch+end, up.substring(1), seen);
            }
            
        }
        return count;
    }

    // using arraylist
    static ArrayList<String> permutationList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++) {
            String start = p.substring(0, i);
            String end = p.substring(i);
            ArrayList<String> list1 = permutationList(start+ch+end, up.substring(1));
            list.addAll(list1);
        }
        return list;
    }


}
