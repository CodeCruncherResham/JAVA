//max 
import java.util.*;
class MaxValue
{
    public static void main(String[] args)
    {
        HashMap<String,ArrayList<Integer>> h = new HashMap<String,ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=5;i++)
        {
            System.out.println("Enter key : ");
            String p = sc.next();
            ArrayList<Integer>l=new ArrayList<Integer>();
            int s=0,max = 0;
            for(int j=1;j<=5;j++)
            {
            l.add(sc.nextInt());
            }
            h.put(p,l);
            for(int v1:l)
            {
            s=s+v1;
            }
            System.out.println("sum is " +s);
            for(int v2:l)
            {
            if(v2>max)
            {
            max = v2;
            }
            }
            System.out.println("max is : " +max);
            }
            for(String k : h.keySet())
            {
            System.out.println("key : " + k +  "  values :");
            for(int v:h.get(k))
            {
            System.out.println("set is " +v);
            }
        }
    }
}