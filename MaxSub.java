//find maximum subset
import java.util.Scanner;
class MaxSub
{
    public static void main(String [] args)
    {
        int m=0,s=0,p=0;
        int [] a={10,20,30,40,50,60,70,80,90,70};
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter combination of subset num : ");
        int z = sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
           if(i%z == 0 && i!= 0)
            {
               if(m<s)
               {
                   m=s;
                   p=i;
               }
               s=0;
           }
           s=s+a[i];
        }
        System.out.println(m);
        System.out.println((p-z)+" to "+(p));
    }
}