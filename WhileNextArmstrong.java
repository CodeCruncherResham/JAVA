//check number is armstrong number or not

/*Defination : AN ARMSTRONG NUMBER IS A N-DIGIT NUMBER THAT IS EQUAL TO THE SUM OF THE NTH POWER OF IT'S DIGIT.*/

import java.util.Scanner;
public class WhileNextArmstrong {

    public static void main(String[] args) {
int sum=0,lastdigit,num,temp,c=0;
Scanner sc = new Scanner(System.in);
        System.out.println("enetr number : ");
num = sc.nextInt();
temp = num;
while(true){
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
        break;

}
}
    }
}