//find power of a number
import java.util.Scanner;
class PowerNum
{
 public static void main(String [] args)
 {
  int i,base,exponent,power=1;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter base number : ");
  base = sc.nextInt();
    System.out.println("Enter exponent number : ");
  exponent = sc.nextInt();

  for(i=1;i <= exponent;i = i + 1)
  {
   power = power * base;
 }
   System.out.println( "power of number is : "+power);
 }
}