import java.util.HashMap;
class Hmap3
{
    public static void main(String [] args)
    {
        HashMap<String,Integer> he = new HashMap<String,Integer>();
        he.put("Raj",40);
        he.put("Ram",60);
        he.put("Rajeev",70);
        he.put("Ashok",80);
        he.put("Shyam",90);
        int s=0;
        for(String k : he.keySet())
        {
        System.out.println("key : " + k +  "  value : " + he.get(k));
        }
        for(String k : he.keySet())
        {
            s=s+he.get(k);
        }
        System.out.println("sum is : " +s);


    }
}
