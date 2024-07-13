import java.util.Scanner;
class SecondDoWhile{
    public static void main(String [] args){
          int d;
          // for prime
          int num;
          //for palindrom
              int rev=0,ele,rem;

          //for armstrong
          int sum=0,lastdigit,temp,c=0;

          char ch;
  Scanner sc = new Scanner(System.in);
do{
                System.out.println("1 for Prime ,2 for Palindrom, 3 for Armstrong");
                             d =  sc.nextInt();
             if(d>3 || d<1)
             {
                System.out.println("please enter number between 1 to 3");
             }

      System.out.println("Enter number : ");
  num = sc.nextInt();

  //for prime number
  if(d==1){
 if(num % 2 == 0)
   {
    System.out.println(num+ " is prime ");
   }
   else
   {
    System.out.println(num+ " is not prime ");
   }
  } 

  //for palindrom number
  if(d==2){
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
    System.out.println(ele+" is not palindrom number");
}


  }
//for armstrong number
if(d==3){
temp = num;
while(num != 0){
    lastdigit = num % 10;
c++;
    num = num / 10;
}
num=temp;
while(num != 0){
    int b = num % 10;

int f=1;
for(int i=1;i<=c;i=i+1){
    f=f*b;
}
    num = num / 10;
sum = sum + f;
}
if(temp == sum){
    System.out.println(temp+" is armstrong");
}
else{
    System.out.println(temp+" is not armstrong");
}

}
            System.out.println("y to continue and n to exit");
            ch=sc.next().charAt(0);

}
        while(ch != 'n');

    }
}