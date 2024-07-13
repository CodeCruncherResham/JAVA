//replace the second element of an ArrayList with the specified element
import java.util.ArrayList;
class Replace
{
    public static void main(String[] args)
    {
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("pink");
        l2.add("aqua");
        System.out.println("Original Arraylist : "+l2);
        l2.set(1,"white");
        for(int index=0;index<l2.size();index++)
        {
            System.out.println(l2.get(index));
        }
    }
}