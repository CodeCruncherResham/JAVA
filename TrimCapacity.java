//trim the capacity of an arraylist the current list size
import java.util.ArrayList;
class TrimCapacity
{
    public static void main(String[] args)
    {
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("pink");
        l2.add("aqua");
        System.out.println("Original Arraylist : "+l2);
        //for increase size use "trimToSize()"
        l2.trimToSize();
        System.out.println("Trim Arraylist : "+l2);
    }
}