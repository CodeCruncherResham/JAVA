//pattern printing
import java.util.Scanner;

class Ptrn_1
{
    public static void main(String[] args)
    {
            String x;
            int i,j;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter word : ");
            x=sc.next();
            for(i=0;i<x.length();i++)
            {
                for(j=0;j<=i;j++)
                {
                    System.out.print(x.charAt(j));
                }
                    System.out.println();
            }
    }
}