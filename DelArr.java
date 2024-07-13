import java.util.Scanner;
class DelArr{
    public static void main(String [] args)
    {
        int c = 0;
        int [] x = {10,2,10,20,30,20,10,70,40};//9
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to be deleted : " );
        int k = sc.nextInt();
        for(int i = 0;i<x.length-c;i++)
        {
            if(x[i] == k)
            {
                for(int j=i;j<x.length-1-c;j++)
                {
                    x[j]=x[j+1];
                }
                c++;
            }
        }
        for(int i=0;i<x.length-c;i++)
        {
            System.out.println( x[i]);
        }
    }
}