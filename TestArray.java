
//test an arraylist is empty or not
import java.util.ArrayList;
class TestArray
{
    public static void main(String[] args)
    {
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("pink");
        l2.add("aqua");
        System.out.println("Original Arraylist : "+l2);
System.out.println("check the above arraylist is empty or not  : "+l2.isEmpty());

        //for increase size use "trimToSize()"
        l2.removeAll(l2);
        System.out.println("after remove Arraylist : "+l2);
System.out.println("check the above arraylist is empty or not  : "+l2.isEmpty());

    }
}