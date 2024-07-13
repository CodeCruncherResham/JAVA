import java.util.*;

class Cmd_Try {
    public static void main(String[] args) {
        try {
            int b = Integer.parseInt(args[0]);
            int c = Integer.parseInt(args[1]);

            System.out.println("divide ans is " + b / c);
            System.out.println("Ans is " + b);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception occurred. Make sure you provide at least 2 arguments.");
        } 
        catch (NumberFormatException n) {
            System.out.println("Integer can not convert into string. Number format exception occurred.");
        } 
        catch (ArithmeticException ae) {
            System.out.println("Divide by zero is not possible. Arithmetic exception occurred.");
        }
        System.out.println("Hello");
    }
}
//try with multiple catch
