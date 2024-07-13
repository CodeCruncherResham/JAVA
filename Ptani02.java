import java.util.*;
class Ptani02{
    public static void main(String[] args)
    {
    ArrayList<String>l1=new ArrayList<String>();
       for(int k=1;k<=2;k++){   
     Scanner sc = new Scanner(System.in);
       System.out.println("Enter word : ");
    l1.add(sc.next());
String t ="";
for(int i=1;i<l1.size();i++)
{   
    for(int j=i+1;j<l1.size();j++)
    {
        if(l1.get(i).length()>l1.get(j).length())
            {
                 t=l1.get(i);
                l1.set(i,l1.get(j));
                l1.set(j,t);
            }
            else
            {
                 t=l1.get(j);
                l1.set(j,l1.get(i));
                l1.set(i,t);
            }
        }
    System.out.println("value is : " +l1);
    }
}
}
}
//arraylist swapping
//isko check krna he swap ni hora