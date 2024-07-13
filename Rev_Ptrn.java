// reverse pattern printing
import java.util.Scanner;

class Rev_Ptrn
{
    public static void main(String[] args)
    {
            String x;
            int i,j;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter word : ");
            x=sc.next();
            for(i=x.length()-1;i>=0;i--)
            {
                for(j=0;j<=i;j++)
                {
                    System.out.print(x.charAt(j));
                }
                    System.out.println();
            }
    }
}