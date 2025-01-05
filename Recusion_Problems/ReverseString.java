import java.util.*;
public class ReverseString 
{
    public static String reverseStr(String str)
    {
    if(str.length()==1)
    {
        return str;
    }
    char current = str.charAt(0);
    String reverse = reverseStr(str.substring(1));
    return reverse+current;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str =sc.next();
        String reversed = reverseStr(str);
        System.out.println("Reversed String is: "+reverseStr(str));
    }
}
