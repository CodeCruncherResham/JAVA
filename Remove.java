
//  empty an array list
import java.util.ArrayList;
class Remove
{
    public static void main(String[] args)
    {
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("pink");
        l2.add("aqua");
        System.out.println("Original Arraylist : "+l2);
        l2.removeAll(l2);
        System.out.println("after remove Arraylist : "+l2);

    }
}