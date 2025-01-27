public class LinearSearch 
{
    
    public static void main(String[] args) 
    {
        int[] arr ={195,277,324,476,621,734,21};
        int ans =search(arr, 61);
        System.out.println("Number found at: "+ans);
    }
    static int search(int[] arr,int target)
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


