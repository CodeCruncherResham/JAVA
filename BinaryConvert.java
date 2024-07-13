// Convert Decimal to Binary
import java.util.Scanner;
class BinaryConvert{
    public static void main(String [] args){
        int n,s=0,p=1,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        n = sc.nextInt();
        while(n != 0){
            b = n%2;
            s = s+b*p;
            p = p*10;
            n = n/2;
        }
            System.out.println( s+ " is binary number");
    }
}