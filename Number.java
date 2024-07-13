//find positive and negative of a number
import java.util.Scanner;
class Number
{
 public static void main(String [] args)
 {
  int input;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter input number : ");
  input = sc.nextInt();
 if(input > 0){
    System.out.println("Number is positive");
 }
 else if(input < 0){
        System.out.println("Number is negative");
 }
 else{
        System.out.println("Number is zero");

 }
 }
}