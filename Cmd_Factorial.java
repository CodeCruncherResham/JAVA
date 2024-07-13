//cmd se gretaer number find krna
import java.util.Scanner;
class Cmd_Factorial
{ 
 public static void main(String [] args)
 {
    int num = Integer.parseInt(args[0]);

  int i,fact = 1;
  for(i=1;i<=num;i++){
   fact = fact * i;
  }
   System.out.println("factorial of " +num+  " = " +fact);
  } 
 }



