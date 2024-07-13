import java.util.Scanner;
class Palindrom1{
public static void main(String [] args)
{ 
    int num,rev=0,ele,rem;
Scanner sc = new Scanner(System.in);
System.out.println("Enter num : ");
num = sc.nextInt();
ele = num;
while(num != 0){
rem = num%10;
rev = rev * 10 + rem;
num = num/10;
}
if(ele == rev){
System.out.println( ele+ " is  palindrom number");
// break;
}
else{
   System.out.println( ele+ " is not palindrom number");
 
}

}
}
