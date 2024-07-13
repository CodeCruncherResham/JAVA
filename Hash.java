import java.util.*;
class Hash
{
    public static void main(String [] args)
    {
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(20);
        h.add(40);
        h.add(20);
        h.add(50);
        h.add(20);
        for(int v:h)
        {
         System.out.println("set is " +v);
        }
        System.out.println("size of the hash set is : " +h.size());
        //used for size
        h.removeAll(h);
        System.out.println("hash set after remove all the elements : " +h);
        //for used remove elements
        System.out.println("check the arraylist empty or not : " +h.isEmpty());
        //used for check empty or not
    }
}
