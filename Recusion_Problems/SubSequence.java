public class SubSequence 
{
    public static void subSequence(String str,int idx,String newString)
    {
        if(idx==str.length())
        {
            System.err.println(newString);
            return;
        }
        char currChar= str.charAt(idx);
        //if adding
        subSequence(str, idx+1, newString+currChar);
        //if not adding
        subSequence(str, idx+1, newString);
    }
    public static void main(String[] args) 
    {
        String str="abcd";
        subSequence(str, 0, "");    
    }
}
