import java.util.HashMap;
class Hmap2
{
    public static void main(String [] args)
    {
        HashMap<String,Integer> he = new HashMap<String,Integer>();
        he.put("Raj",40);
        he.put("Ram",60);
        he.put("Rajeev",70);
        he.put("Ashok",80);
        he.put("Shyam",90);
        for(String k : he.keySet())
        {
        System.out.println("key : " + k +  "  value : " + he.get(k));
        }
    }
}
