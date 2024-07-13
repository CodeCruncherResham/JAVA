import java.util.Arrays;
import java.util.Scanner;
class Sbthird
{
    public static void main(String [] args)
    {
        int i;
        String x = "Resham Yadav";
        String[] y=x.split(" ");
        for(i=0;i<y.length;i++)
        {
            StringBuffer sb = new StringBuffer(y[i]);
            sb.reverse();
            System.out.println(sb);
        }
    }
}
//ise complete krna he