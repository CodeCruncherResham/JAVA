import java.util.Scanner;
class Reverse
{
 public static void main(String [] args)
 {
  int r = 0,n,b;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  n = sc.nextInt();
  while(n != 0){
    b = n%10;
    r = r * 10 + b;
    n = n / 10;
  }
   System.out.println("The reverse number is : "+r);
 }
}