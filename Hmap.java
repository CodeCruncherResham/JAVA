import java.util.*;
class Hmap
{
    public static void main(String [] args)
    {
        HashMap<String,Integer> he = new HashMap<String,Integer>();
        he.put("Raj",40);
        he.put("Ram",60);
        he.put("Rajeev",70);
        he.put("Ashok",80);
        he.put("Shyam",90);
        System.out.println(he.get("Ashok"));
        System.out.println(he.containsKey("A"));
        //it is used for value or key is availabe or not if avilabe op is true else false

    }
}
