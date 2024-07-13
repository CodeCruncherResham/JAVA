//increase the size of an arraylist
import java.util.ArrayList;
class IncreaseSize
{
    public static void main(String[] args)
    {
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("pink");
        l2.add("aqua");
        System.out.println("Original Arraylist : "+l2);
        //for increase size use "ensureCapacity()"
        l2.ensureCapacity(6);
        l2.add("black");
        l2.add("orange");
        l2.add("yello");
        l2.add("white");
        System.out.println("New Arraylist : "+l2);
    }
}