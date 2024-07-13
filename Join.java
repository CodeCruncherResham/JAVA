//join two array list
import java.util.ArrayList;
class Join
{
    public static void main(String[] args)
    {
        ArrayList<String>l1=new ArrayList<String>();
        l1.add("apple");
        l1.add("grapes");
        l1.add("black grapes");
        l1.add("chiku");
        System.out.println("Second Arraylist : "+l1);
        ArrayList<String>l2=new ArrayList<String>();
        l2.add("red");
        l2.add("green");
        l2.add("violet");
        l2.add("brown");
        System.out.println("First Arraylist : "+l2);
        ArrayList<String>l3=new ArrayList<String>();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println("Final Arraylist : "+l3);

    }
}