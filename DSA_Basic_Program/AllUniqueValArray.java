public class AllUniqueValArray {
    public static void main(String[] args) {
        int[] arr ={3, 3, 5, 2, 5, 6, 1, 2, 9};
        int n = arr.length;
        int freq = 0;
        int ans = 0;
        for (int i=0; i<n; i++) {
            if(freq==0)
                ans = arr[i];
            if(ans==arr[i])
                freq++;
            // if(freq==1)
                // ans = arr[i];   
                System.out.println(ans);    
        }
         
    }
}
