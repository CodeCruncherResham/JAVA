//maxsum
import java.util.ArrayList;
class List5
{
    public static void main(String [] args)
    {
        ArrayList<Integer>l=new ArrayList<Integer>();
        int max = 0;
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        ArrayList<Integer>l2=new ArrayList<Integer>();
        for(int i=0;i<l.size();i++)
        {
            if(max<l.get(i))
            max=l.get(i);
        }
        System.out.println("maximum element in arraylist is " +max);
        int k = 10,ans=0;
        for(int i = 0;i<l.size();i++)
        {

          k = k + l.get(i);
         l2.add(k);
        }
        for(int v : l2)
        {
        if(max>=ans)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        System.out.println("given element maxsum arraylist is " +v);
        }


    }
}