//constructor
class Set
{
    private int rollno;
    private String name;
    private float marks;
    public void set(int r,String n,float m)
    {
        rollno = r;
        name= n;
        marks= m;
    }
    public int getrollno()
    {
        return rollno;
    }
    public String getname()
    {
        return name;
    }
    public float getmarks()
    {
        return marks;
    }

    public static void main(String[] args)
    {
        Set s1 = new Set();
        s1.set(21,"Krishna",75);
        System.out.println(s1.getrollno());
        System.out.println(s1.getname());
        System.out.println(s1.getmarks());
    }
}
    
