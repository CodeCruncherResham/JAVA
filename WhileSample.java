import java.util.Scanner;
class WhileSample{
public static void main(String [] args){
int n,s=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number : ");

while(true){
n = sc.nextInt();
if(n == -1)
{
break;
   }
s=s+n;
  }
System.out.println(s);
 }
}