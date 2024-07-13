//increase the size of an arraylist
import java.util.*;
class CompareList
{
    public static void main(String[] args)
    {
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("pink");
        l2.add("aqua");
        l2.add("yellow");
        l2.add("white");
        ArrayList<String>l3=new ArrayList<String>();
        l3.add("red");
        l3.add("green");
        l3.add("pink");
        l3.add("aqua");
        l3.add("yellow");
         ArrayList<String>l4=new ArrayList<String>();
        for(String e : l2)
        l4.add(l3.contains(e)?"yes":"no");
        System.out.print(l4);
        }

    }
