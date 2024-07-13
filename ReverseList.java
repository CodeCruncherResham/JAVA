import java.util.ArrayList;
class ReverseList
{
    public static void main(String [] args)
    { 
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        ArrayList<Integer>list2=new ArrayList<Integer>();
        for(int i=list.size()-1;i>=0;i--)
        {
        list2.add(list.get(i));
        }
        for(int v : list2)
        {
        System.out.println(v);
        }

    }
}