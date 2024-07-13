import java.util.Scanner;
class Prime
{
 public static void main(String [] args)
 { 
  int num;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  num = sc.nextInt(); 
 if(num % 2 == 0)
   {
    System.out.println("number is prime " +num);
   }
   else
   {
    System.out.println("number is not prime " +num);
   }
 }
}