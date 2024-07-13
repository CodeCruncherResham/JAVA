import java.util.*;
class Data{
    protected int a;
    public void set(int w){
        a=w;
    }
    void cal(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

    }

}

class Factorial extends Data{
        void cal(){
  int i, num,fact = 1;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number : ");
  num = sc.nextInt(); 
  for(i=1;i<=num;i=i+1){
   fact = fact * i;
  }
   System.out.println("factorial of " +num+  " = " +fact);
      super.cal();//even odd
         System.out.println("given set is" +a);


    }
}
class P_Supr extends Factorial
{
     void cal(){
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
   super.cal();//factorial
 }

     public static void main(String[] args)
    {
        P_Supr x = new P_Supr();
        x.set(10);
        x.cal(); //prime

    }

}