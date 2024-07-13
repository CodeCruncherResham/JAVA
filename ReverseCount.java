import java.util.Scanner;
class ReverseCount
{
 public static void main(String [] args)
 {
  int sum = 0,n,b,count = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  n = sc.nextInt();
  while(n != 0){
    b = n%10;
    sum = sum + b;
count = count + 1;
    n = n / 10;
  }
   System.out.println("The count is : "+count);
 }
}