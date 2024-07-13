//calculate total
import java.util.*;
class TotalValue
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
                int s=0;
                for(int j=1;j<=5;j++)
                {
                l.add(sc.nextInt());
                }
                    //key means string and values mean int
                h.put(p,l);
                for(int v1:l)
                {
                s=s+v1;
                }
                System.out.println("sum is " +s);
            }
                for(String k : h.keySet())
                {
                System.out.println("key : " + k + "values :" );
                for(int v:h.get(k))
                {
                System.out.println("value is " +v);
                }
                }
    }
}