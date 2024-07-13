//find factorial number
import java.util.Scanner;
class Factorial1
{
 public static void main(String [] args)
 { 
  int i, num,fact = 1;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  num = sc.nextInt(); 
  for(i=1;i<=num;i++){
   fact = fact * i;
  }
   System.out.println("factorial of " +num+  " = " +fact);
 }
}