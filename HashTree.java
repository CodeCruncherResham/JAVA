import java.util.*;
class HashTree
{
    public static void main(String [] args)
    {
        //tree set is used for sort the set
        TreeSet<Integer> he = new TreeSet<Integer>();
        int[] x=new int[10];
        // LinkedHashSet<Integer>he=new LinkedHashSet<Integer>();
        
        //linked is used for ordered set
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");

        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<x.length;i++)
        {
        he.add(x[i]);
        }
        for(int v:he)
        {
         System.out.println("Sort set is " +v);
        }
    }
}
