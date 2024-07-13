//increase the size of an arraylist
import java.util.*;
class SwapList
{
    public static void main(String[] args)
    {
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("pink");
        l2.add("aqua");
        System.out.println("Before swap Arraylist : ");
        for(String a :l2){
            System.out.println(a);
        }
        //swapping 1st element with 3rd element
        Collections.swap(l2,0,2);
        System.out.println("After swap Arraylist : ");
                for(String b :l2){
            System.out.println(b);
        }

    }
}