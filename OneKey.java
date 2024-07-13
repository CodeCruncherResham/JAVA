import java.util.*;
class OneKey
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
                    for(int j=1;j<=5;j++)
                    {
                        l.add(sc.nextInt());
                    }
                    h.put(p,l);
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