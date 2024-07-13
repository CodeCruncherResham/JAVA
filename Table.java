// write a java progaram that takes a number as i/p and prints its multiplication table up to 10
import java.util.*;
class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int num = sc.nextInt();
        int i,store;
        for(i=1;i<=10;i++){
            store=num*i;
        System.out.println(num+"*"+i+"="+store);
        }

    }
}
