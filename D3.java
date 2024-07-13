import java.util.Scanner;

class Data{
    protected int a;
    public void set(int w){
        a=w;
    }
}
class D2 extends Data{
    void fact(){
  int i, num,fact = 1;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  num = sc.nextInt(); 
  for(i=1;i<=num;i=i+1){
   fact = fact * i;
  }
   System.out.println("factorial of " +num+  " = " +fact);
    }
    void cal(){
           System.out.println(a);
    }
}
class D3 extends D2{
 void prime(){
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
     public static void main(String[] args)
    {
        D3 x = new D3();
        x.set(10);
        x.cal(); 
        x.fact();
        x.prime();

    }

}