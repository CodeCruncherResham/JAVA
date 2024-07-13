import java.util.Scanner;
class WhileCount
{
 public static void main(String [] args)
 {
  int n,p=0,c=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  while(true)
   {
    n = sc.nextInt();
    if(n == -1)
     {
     break;
     }
     if(p != n)
      {
        c  = c+1;
      }
p=n;
  }
System.out.println( "distinct count is : " +c);
 }
}