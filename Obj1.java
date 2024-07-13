import java.util.*;
class M
{
    private int rollno;
    private String name;
    private float marks;
    public void setrnm(int r,String n,float m)
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

}
class Obj1{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        M s1 = new M();
        M s2 = new M();
        System.out.println("Enter rollno and name and marks of Student1 : ");
        s1.setrnm(sc.nextInt(),sc.next(),sc.nextFloat());
        System.out.println("Enter rollno and name and marks of Student2 : ");
        s2.setrnm(sc.nextInt(),sc.next(),sc.nextFloat());
        System.out.println("topper student : ");
if(s1.getmarks()>s2.getmarks())
{
    System.out.println("name is " +s1.getname());
    System.out.println("roll no is "+s1.getrollno());
}
else
{
    System.out.println("name is " +s2.getname());
    System.out.println("roll no is "+s2.getrollno());
}
}
}