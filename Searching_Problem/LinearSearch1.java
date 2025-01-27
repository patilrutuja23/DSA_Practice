public class LinearSearch1 
{
    public static void main(String[] args) 
    {
        int[] arr ={195,277,324,476,621,734,21};
        int target=324;
        if(search(arr,target))
        {
            System.out.println("Elemenet " +target + " found at index: "+ searchIndex(arr, target));
        }
        else
        {
            System.out.println("No element found");
        }
    }
    static boolean search(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
            
        }
        return false;
    }
    static int searchIndex(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
            
        }
        return -1;
    }
}
