import java.util.*;
class Ptani01{
    public static void main(String[] args)
    {
    ArrayList<String>l=new ArrayList<String>();
for(int i=1;i<=5;i++)
{    Scanner sc = new Scanner(System.in);
       System.out.println("Enter word : ");
    l.add(sc.next());
}
Collections.sort(l);
for(String v:l)
{
    System.out.println("get value through al are : " +v);
}
    }
}