//sum of subset of array in java
import java.util.Scanner;
class SubSet{
    public static void main(String [] args)
    {
                int [] x = {10,20,30,40,50,60,70,80,90};//9
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter combination of subset num : ");
        int k = sc.nextInt();
                int sum=0;
        for(int i=0;i<x.length;i++)
        {
            if(i%k==0 && i!= 0){
                System.out.println(sum);
                sum=0;
            }
            sum=sum+x[i];
        }
                        System.out.println(sum);
    }
}