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

    public static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }


    public static void main(String[] args) 
    {
        String str="abcd";
        subSequence(str, 0, "");  
        subSeq("","abc");  
    }
}
