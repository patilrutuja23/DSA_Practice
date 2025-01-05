public class MoveAllX 
{
   
    public static void moveX(String str,int idx,int count, String newString)
    {
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);    
            return;
        }
        if(str.charAt(idx)=='x')
        {
            count ++;
            moveX(str, idx+1, count,newString);
        }
        else
        {
            newString+=str.charAt(idx);
            moveX(str, idx+1, count,newString);
        }
    }
    public static void main(String[] args) 
    {
        String str="axajhaxasbxaushxuhaxaash";
        moveX(str, 0, 0,"");
    }
}
