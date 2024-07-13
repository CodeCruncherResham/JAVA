// Convert Binary to Decimal
import java.util.Scanner;
class DecimalConvert{
    public static void main(String [] args){
        int n,s=0,p=1,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        n = sc.nextInt();
        while(n != 0){
            b = n%10;
            s = s+b*p;
            p = p*2;
            n = n/10;
        }
            System.out.println( s+ " is Decimal number");
    }
}