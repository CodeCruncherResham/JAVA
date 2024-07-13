import java.util.*;
class Data
{
    protected int sub1;
    public void set(int s1) 
    {
      sub1 = s1;
    }
}

interface I1
{
 public void cal1();
}

interface I2
{
 public void cal2();
}

class Intrfc_03 extends Data implements I1,I2
{
    //code for prime
public void cal1()
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


    //code for factorial
    public void cal2()
    {
  int i, num,fact = 1;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  num = sc.nextInt(); 
  for(i=1;i<=num;i=i+1){
   fact = fact * i;
  }
   System.out.println("factorial of " +num+  " = " +fact);
    }

    public static void main(String[] args)
    {
        Intrfc_03 im = new Intrfc_03();
        im.set(5);
        im.cal1();
        im.cal2();
    }
}
