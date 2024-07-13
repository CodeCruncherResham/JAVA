import java.util.*;
class Hash1
{
    public static void main(String [] args)
    {
        int [] x = {10,20,30,20,4,20,7,20,85,20,50};
        HashSet<Integer> he = new HashSet<Integer>();
        for(int i=0;i<x.length;i++)
        {
        he.add(x[i]);
        }
        for(int v:he)
        {
         System.out.println("set is " +v);
        }
    }
}
