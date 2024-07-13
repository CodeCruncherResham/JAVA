import java.util.Scanner;
class ReverseSum
{
 public static void main(String [] args)
 {
  int sum = 0,n,b;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  n = sc.nextInt();
  while(n != 0)
  {
    b = n%10;
    sum = sum + b;
    n = n / 10;
  }
   System.out.println("The sum is : "+sum);
 }
}