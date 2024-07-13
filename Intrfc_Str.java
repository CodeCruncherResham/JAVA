import java.util.*;
class Data
{
    protected String sub1;
    public void set(String s1) 
    {
      sub1 = s1;
    }
}

interface I1
{
 public void cal1();//prime
}

interface I2
{
 public void cal2();//palindrom
}

interface I3
{
    public void cal3();//factorial
}


class Intrfc_Str extends Data implements I1,I2,I3
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

//code for palindrom
public void cal2()
{
int num,rev=0,ele,rem;
Scanner sc = new Scanner(System.in);
System.out.println("Enter num : ");
num = sc.nextInt();
ele = num;
while(num != 0)
{
rem = num%10;
rev = rev * 10 + rem;
num = num/10;
}
if(ele == rev)
{
System.out.println( ele+ " is  palindrom number");
// break;
}
else
{
System.out.println( ele+ " is not palindrom number");
}
}
    //code for factorial
public void cal3()
{
int i, num,fact = 1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number : ");
num = sc.nextInt(); 
for(i=1;i<=num;i=i+1)
{
fact = fact * i;
}
System.out.println("factorial of " +num+  " = " +fact);
}

public static void main(String[] args)
{
Intrfc_Str im = new Intrfc_Str();
im.set("Hello");
im.cal1();
im.cal2();
im.cal3();
}
}
