// find first and list digit & sum of a number

import java.util.Scanner;
class SumFstLst
{
    public static void main(String [] args)
    {
        int n,first,last,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n = sc.nextInt();
        first = n;
        while (first >= 10){
            first = first/10;
        }
        last = n % 10;
        sum = first+last;
        System.out.println("The First Digit of a Given Number " + n + "  =  "  + first);

   System.out.println("The Last Digit of a Given Number " + n + "  =  " + last);

        System.out.println("Sum of first and last digit is :"+sum);
    }
}