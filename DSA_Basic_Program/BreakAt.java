import java.util.*;
public class BreakAt
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String: ");
        String org= sc.next();
        String res ="";  
        for(int i=0;i<org.length();i++)
        {
            if(org.charAt(i)=='@')
            {
                break;
            }
            else 
            {
                res+=org.charAt(i);
            }
        }
        System.out.println("Uasername : "+res);
    }
}
