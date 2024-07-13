import java.util.Scanner;
class FirstLast
{
 public static void main(String [] args)
 {
  int n,b,z;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter number : ");
  n = sc.nextInt();
  z=n;
  while(n != 0){
    b = n%10;
    n = n / 10;
  }
   System.out.println("Firstlast number is : "+n);
 }
}