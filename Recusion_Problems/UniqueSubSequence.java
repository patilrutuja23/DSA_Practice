
import java.util.HashSet;
import java.util.Set;


public class UniqueSubSequence 
{
    public static void subSequence(String str,int idx,String newString,HashSet<String> set)
    {
        if(idx==str.length())
        {
            if(set.contains(newString))
            {
                return;
            }
            else
            {
                System.err.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar= str.charAt(idx);
        //if adding
        subSequence(str, idx+1, newString+currChar, set);
        //if not adding
        subSequence(str, idx+1, newString, set);
    }
    public static void main(String[] args) 
    {
        String str="aaaa";
        HashSet<String> set = new HashSet<>();
        subSequence(str, 0, "", set);    
    }
}
