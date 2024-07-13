//write a java program and compute the sum of an int digit
import java.util.*;
class Sum_digit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
int sum=0,reminder;
while(num!=0){
    reminder=num%10;
    sum=sum+reminder;
    num=num/10;
}  
        System.out.println("the sum of the digits is : "+sum);

    }
}
