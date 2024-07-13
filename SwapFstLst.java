//swap first and last digit of a number

import java.util.Scanner;
class SwapFstLst
{
    public static void main(String [] args)
    {
        int first,last,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
         first = sc.nextInt();
                 System.out.println("Enter last number :");
        last = sc.nextInt();

        System.out.println("--Before swap--");
         System.out.println("The First Number = " + first);

   System.out.println("The Last Number= "  +last);

temp = first;
first = last;
last = temp;
System.out.println("--After swap--"); 
         System.out.println("The First Number= " + first);
   System.out.println("The Last Number= "  +last);

    }
}