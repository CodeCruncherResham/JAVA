//print all the elements of a ArrayList using the position of the elements
import java.util.ArrayList;
class PrintAll
{
    public static void main(String[] args)
    {
        ArrayList<Integer>l2=new ArrayList<Integer>();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        System.out.println("Original Arraylist : "+l2);
        for(int index=0;index<l2.size();index++)
        {
            System.out.println(l2.get(index));
        }
    }
}