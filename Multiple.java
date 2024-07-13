//multiple object
import java.util.*;
class Student
{
    private int rollno;
    private String name;
    private float marks;
    public void setrnm(int r,String n,float m)
    {
        rollno = r;
        name = n;
        marks = m;
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
class Multiple{
    public static void main(String[] args)
    {
        ArrayList<Student>l=new ArrayList<Student>();
        for(int i=1;i<=5;i++)
        {
            Scanner sc = new Scanner(System.in);
            Student s1 = new Student();
            System.out.println("Enter rollno and name and marks of Student : ");
            s1.setrnm(sc.nextInt(),sc.next(),sc.nextFloat());
            l.add(s1);
        }
            for(Student v:l)
            {
                System.out.println(v.getrollno());
                System.out.println(v.getname());
                System.out.println(v.getmarks());
            }

    }
}