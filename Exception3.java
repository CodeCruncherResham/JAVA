//exception handling concept 
import java.util.*;
class Exception3{
    public static void main(String [] args){
        int a;      
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");
        try{
        a= Integer.parseInt(sc.next());
        System.out.println("Ans is "+a);
        }
        catch(NumberFormatException e){
           System.out.println("integer can not convert into string number format exception");
        }
        System.out.println("Hello");

    }
}
//number format exception problem solution