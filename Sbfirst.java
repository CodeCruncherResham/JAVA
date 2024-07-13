import java.util.Scanner;
class Sbfirst
{
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter num : ");
       String num = sc.next();
       StringBuffer sb = new StringBuffer(num);
       sb.reverse();
       String s = sb.toString();
       if(num.equals(s))
       {
         System.out.println("Palindrom");
       }
       else
       {
          System.out.println("not palindrom");
       }
    }
}

//check word is palindrom or not