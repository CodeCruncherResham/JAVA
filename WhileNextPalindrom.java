import java.util.Scanner;
class WhileNextPalindrom{
    public static void main(String [] args){
        int number,temp,reminder,reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr number : ");
        number=sc.nextInt();

        while(true){
            number++;
            temp=number;
            while(number != 0){
                reminder = number % 10;
                reverse = reverse * 10 + reminder;
                number = number / 10;
            }
            if(temp == reverse){
                System.out.println(temp+" next palindrom number");
                break;
            }
            reverse=0;
            number=temp;
            }
        }
    }
