import java.util.Scanner;
class WhileAsending{
public static void main(String [] args){
int n,max=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number : ");

while(true){
n = sc.nextInt();
if(n == -1){
break;
   }
if(n>max){
  max  = n;
}
  }
   System.out.println(max);
  }
}