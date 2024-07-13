import java.util.Scanner;
class MagicNum{
    public static void main(String [] args){
        int n,temp,rev=0,digit,sum=0,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
         n = sc.nextInt();
        temp=n;
        while(true){
        while(temp != 0){
             b = temp%10;
            sum=sum+b;
            temp = temp/10;
        }
        temp=sum;
        while(temp != 0){
             b = temp%10;
            rev = rev*10+b;
            temp = temp/10;
        }
        if(rev*sum==n){
            System.out.println( n+ " is magic number");

        }
    }
}
}

