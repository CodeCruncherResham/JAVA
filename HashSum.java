import java.util.*;
class HashSum
{
    public static void main(String [] args)
    {
        int[] x=new int[10];
        HashSet<Integer> he = new HashSet<Integer>();
        int s=0;
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
            s=s+v;
        }
         System.out.println("set is " +s);

    }
}
