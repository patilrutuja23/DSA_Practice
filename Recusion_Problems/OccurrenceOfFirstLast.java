import java.util.*;
public class OccurrenceOfFirstLast 
{
    public static int first=-1;
    public static int last=-1;
    public static void getIndices(String str,char s, int index)
    {
        if(index==str.length())
        {
            return;
        }
        if(str.charAt(index)==s)
        {
            if(first==-1)
            {
                first=index;
            }
            else
            {
                last=index;
            }
        }
        getIndices(str, s, index+1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String =");
        String str=sc.next();
        
        char c= 'd';
        getIndices(str, c, 0);
        System.out.println("First occurrence of "+c+" is at "+first+" and last at "+last);

    }
}
