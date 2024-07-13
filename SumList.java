import java.util.ArrayList;
class SumList
{
    public static void main(String [] args)
    {
        int s = 0;
        ArrayList<Integer>l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        for(int i=0;i<l.size();i++)
        {
            s=s+l.get(i);
        }
        System.out.println(s);
    }
}