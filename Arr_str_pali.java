//write a program for number of word are palindrom or not using arraylist and string buffer
import java.util.Scanner;
import java.util.ArrayList;
class Arr_str_pali
{
    ArrayList<String>l=new ArrayList<String>();
    public static void main(String [] args)
    {
       String s="";
      for(int i=0;i<=5;i++){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter word : ");
       l.add(sc.next());
       StringBuffer sb = new StringBuffer(num);
       sb.reverse();
       s = sb.toString();
    for(String num:l){

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
}
//isko complete krna he
