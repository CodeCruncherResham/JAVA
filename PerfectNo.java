//check number is perfect or not 
import java.util.Scanner;
class PerfectNo
{
 public static void main(String [] args)
 {
  int i,n,sum=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  n = sc.nextInt();
  for(i=1;i <= n/2;i = i + 1)
  {
   if(n % i == 0)
    {
    System.out.println(i);
    sum = sum + i;
    }
   }
 if(sum == n) 
      {
       System.out.println("Number is perfect");
      }
      else
      {
      System.out.println("Number is not perfect");
      }
   System.out.println("Sum is : "+sum);
 }
}