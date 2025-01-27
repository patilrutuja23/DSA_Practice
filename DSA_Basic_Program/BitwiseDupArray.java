public class BitwiseDupArray 
{
    public static void main(String[] args) 
    {
        int[] arr={1,3,4,4,1,3,6,5,6};
        System.out.println(unique(arr));
    }
    static int unique(int arr[])
    {
        int unique =0;
        for(int n : arr)
        {
            unique^=n; 
        }
        return unique;
    }
}
