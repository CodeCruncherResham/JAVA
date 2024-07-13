//exception handling concept 
// import java.util.*;
// class Exception1{
//     public static void main(String [] args){
//                 int[] x = new int[3];
// System.out.println(x[5]);
//     }
// }
// A Common cause of index out of bound

import java.util.*;
class Exception1{
    public static void main(String [] args){
    int[] x = new int[3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter string");
    x[3]=sc.nextInt();          
try{
            System.out.println("array elements are :" +x[5]);
}
    catch(ArrayIndexOutOfBoundsException e)
{
        System.out.println(" Index 5 out of bounds for length 3");
}
System.out.println("Hello");
    }
}

//example of arrayindexoutofboundexception
//isko krna he 
