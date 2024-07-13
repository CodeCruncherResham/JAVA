import java.util.Scanner;
class StrEx2
{
    public static void main(String[] args)
    {
        int val1,val2,i;
        String y1="",y2="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Original String: ");
        String x = sc.next();
           val1 = x.charAt(0);
           val2 = x.charAt(10);

        //  y1=y1+val1;
        // y2=y2+val2;

        System.out.println("The Character at position 0 is = "+(char)val1);
        System.out.println("The Character at position 10 is = "+(char)val2);

    }
}
//get the character at the given index within the string
//isko complete krna he