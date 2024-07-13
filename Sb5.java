import java.util.*;

class Sb5
{
    public static void main(String[] args)
    {
      int rollno,i;
     String name;
     float marks;
     for(int j=1;j<=5;j++){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter roll number,name,marks : ");
        rollno = sc.nextInt();
       System.out.println("Enter name : ");
        name = sc.next();
       System.out.println("Enter marks : ");
        marks = sc.nextFloat();
        StringBuffer sb = new StringBuffer();
            String[] y=name.split(" ");
        // sb.reverse();
        for(i=0;i<y.length;i++)
        {
            StringBuffer sb1 = new StringBuffer(y[i]);
        System.out.print(rollno +",");
        sb1.reverse();
        System.out.print(sb1 +",");
        System.out.println(marks +"@");
        }
     }
    }
}