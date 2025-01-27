public class SearchRange 
{
    public static void main(String[] args) 
    {
        int[] arr ={195,277,324,476,621,734,21};
        int target=476;
        int start =1;
        int end=3;
        if(search(arr, target, start, end))
        {
            System.out.println("Number "+ target + " found in the range "+start +" to "+end);
        }
        else
        {
            System.out.println("Not found");
        }
    }
    static boolean search(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=start;i<=end;i++)
        {
            if(target==arr[i])
            {
                return true;
            }

        }
        return false;
    }
}
