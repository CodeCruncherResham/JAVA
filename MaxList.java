import java.util.ArrayList;
class MaxList
{
    public static void main(String [] args)
    {
        ArrayList<Integer>l=new ArrayList<Integer>();
        int max = 0;
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(70);
        l.add(40);
        l.add(50);
        for(int i=0;i<l.size();i++)
        {
            if(max<l.get(i))
            max=l.get(i);
        }
        System.out.println("maximum element in arraylist is " +max);

    }
}