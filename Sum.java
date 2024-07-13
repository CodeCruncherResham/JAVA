
import java.util.Scanner;
class Sum
{
 public static void main(String [] args)
 {
  int n,i,sum=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  n = sc.nextInt(); 
  for(i = 1;i <= n/2;i = i + 1)
  {
   if(n%i == 0)
   {
   System.out.println(i);
   sum = sum + i;
   }
    
  }
    System.out.println( "total sum is : " +sum);
 }
}
   