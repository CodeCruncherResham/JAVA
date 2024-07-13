import java.util.*;
class Cmd3{
    public static void main(String [] args){
                int[] x = new int[3];
                int b=0;
                try{
System.out.println(x[5]/b);
                }
                    catch(ArrayIndexOutOfBoundsException ai)
{
        System.out.println(" Index 5 out of bounds for length 3");
}
catch(ArithmeticException ae)
{
        System.out.println("divide by zero is not possible");
}

catch(Exception e)
{
        System.out.println("Error");
}

    }
}
//isko ek bar check krna he