//exception handling concept 
import java.util.*;
class ArithExcep{
    public static void main(String [] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");
        a=sc.nextInt();

System.out.println("Please enter second string");
b=sc.nextInt();

try{
    System.out.println("divide ans is " +a/b);
}
catch(ArithmeticException e)
{
        System.out.println("divide by zero is not possible");
}
System.out.println("Hello");
    }
}