import java.util.Scanner;
class NaturalNum
{
 public static void main(String [] args)
 {
  int i,num;
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter number : ");
  num = sc.nextInt();
  for(i=1;i<=num;i=i+1)
  {
  System.out.println(i);
  }
 }
}