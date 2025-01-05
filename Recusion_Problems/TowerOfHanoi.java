

public class TowerOfHanoi 
{
    public static void towerOfHanoi(int n, String disc,String helper,String destination)
    {
        if(n==1)
        {
            System.out.println("Transfering disk "+n+" from "+disc+" to "+destination);
            return;
        }        
        towerOfHanoi(n-1,disc,destination,helper);
        System.out.println("Transfering disk "+n+" from "+disc+" to "+destination);
        towerOfHanoi(n-1,helper, disc, destination);
    }
    public static void main(String[] args) 
    {
        int n=3;
        towerOfHanoi(n,"A","B","C");
    }
}
