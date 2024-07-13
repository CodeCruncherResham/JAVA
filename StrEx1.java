import java.util.Scanner;
class StrEx1
{
    public static void main(String[] args)
    {
        int val1=0,val2=0,i;
        String y1="",y2="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Original String: ");
        String x = sc.next();
           val1 = x.codePointAt(1);
            val2 = x.codePointAt(9);

         y1=y1+val1;
        y2=y2+val2;

        System.out.println("Character(Unicode Point) = "+y1);
        System.out.println("Character(Unicode Point) = "+y2);

    }
}
//get the character (Unicode code point) at the given index within the string