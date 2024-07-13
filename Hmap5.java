//key ip and op provide value
import java.util.*;
class Hmap5
{
    public static void main(String [] args)
    {
        HashMap<String,Integer> he = new HashMap<String,Integer>();
        he.put("Raj",40);
        he.put("Ram",60);
        he.put("Rajeev",70);
        he.put("Ashok",80);
        he.put("Shyam",90);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key : ");
        String p = sc.next();

        if(he.containsValue(p)==true)
        {
        System.out.println(he.get(p));
        }
        else
        {
          System.out.println("not avilable");
        }
        // for(String k : he.keySet())
        // {
        // System.out.println("key : " + k +  "  value : " + he.get(k));
        // }
    }
}
