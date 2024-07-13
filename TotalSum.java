import java.util.Scanner;
class TotalSum
{
 public static void main(String [] args)
 {
  int r = 0,n,b,z;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  n = sc.nextInt();
  z = n;
  while(n != 0)
  {
    b = n%10;
    r = r * 10 + b;
    n = n / 10;
  }
   System.out.println("The sum is : "+(r+z));
 }
}