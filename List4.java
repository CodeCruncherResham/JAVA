
//running sum 
import java.util.ArrayList;
class List4
{
    public static void main(String [] args)
    {
        ArrayList<Integer>l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        int sum =0;
        ArrayList<Integer>l2=new ArrayList<Integer>();
        for(int i = 0;i<l1.size();i++)
        {

          sum = sum + l1.get(i);
           l2.add(sum);
        }
        for(int v : l2)
        {
        System.out.println("given element sum arraylist is " +v);
        }

    }
}