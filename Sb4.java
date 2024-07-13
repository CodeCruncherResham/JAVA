//write a program for number of word are palindrom or not

import java.util.Scanner;
class Sb4
{
    public static void main(String [] args)
    {
       String num="",s="";
      for(int i=0;i<=5;i++){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter num : ");
       num = sc.next();
       StringBuffer sb = new StringBuffer(num);
       sb.reverse();
       s = sb.toString();
        if(num.equals(s)){
            System.out.println(s+" is a palindrom");
        }
        else
        {
            System.out.println(s+" is a not palindrom");

        }
    }
      }

    }
