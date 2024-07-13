import java.util.Scanner;
class WhilePrime{
 public static void main(String [] args){
int i,n,c=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter number : ");
n=sc.nextInt();
while(true){
n++;
for(i = 1;i <=n/2;i++){
if(n%i==0){
c = c+1;
}
}
if(c == 1){
System.out.println(n+ " is next prime number");
break;
}
c=0;
}
}
}
