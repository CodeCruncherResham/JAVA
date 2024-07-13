// find first and list digit of a number
import java.util.Scanner;
class First
{
 public static void main(String [] args)
 {
  int n,first,last;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter number : ");
  n = sc.nextInt();
  first = n;
  while(first >= 10)
  {
    first = first / 10;
  }
  last = n%10;
   System.out.println("The First Digit of a Given Number " + n + "  =  " + first);
   System.out.println("The Last Digit of a Given Number " + n + "  =  " + last);
 }
}