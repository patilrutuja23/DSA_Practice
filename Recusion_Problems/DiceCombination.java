
import java.util.ArrayList;

public class DiceCombination {

    public static void main(String[] arg) {
        dice("", 6);

        ArrayList<String> result = diceList("", 4);
        System.out.println(result);

        System.out.println("Count is  "+ diceCount("", 4));
    }


    public static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }
        for(int i=1; i<=6 && i<=target; i++) {
            dice(p+i, target-i);
        }
    }


    public static ArrayList<String> diceList(String p, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++) {
            ArrayList<String> list1 = diceList(p+i, target-i);
            list.addAll(list1);
        }
        return list;
    }

    public static int diceCount(String p, int target) {
        if(target == 0) {
            return 1;
        }
        if(target < 0) {
            return 0; 
        }
        int count = 0;
        for(int i=1; i<=6 && i<=target; i++) {
            count = count + diceCount(p+i, target-i);
        }
        return count;
    }
    
}
