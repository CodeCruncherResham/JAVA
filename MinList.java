import java.util.ArrayList;
class MinList
{
    public static void main(String [] args)
    {
        ArrayList<Integer>l=new ArrayList<Integer>();

        l.add(10);
        l.add(1);
        l.add(20);
        l.add(40);
        l.add(50);
        l.add(30);
                int min=l.get(0);
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)<min)
            min=l.get(i);
        }
        
        
        
        
        
          System.out.println("minimum element in arraylist is " +min);

    }
}