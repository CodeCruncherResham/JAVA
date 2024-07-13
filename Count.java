import java.util.Scanner;
class Count
{
 public static void main(String [] args)
 {
  int i,n,count=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  n = sc.nextInt();
  for(i = 1;i <= n/2;i = i + 1)
  {
   if(n%i == 0)
   {
    System.out.println(i);
    count++;
   }
  }
  System.out.println("count is : " + count);
 }
}