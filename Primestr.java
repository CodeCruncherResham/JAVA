import java.util.*;
class Primestr{
    public static void main(String[] args){
        String[][] x = new String[3][2];
          String num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");

        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
        num=sc.next();
        x[i][j]=num;

            }
        }
        //first three rows are
                for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
        System.out.print(x[i][j] +"  ");
            }
        System.out.println();
        }
 if(num  2 == 0)
   {
    System.out.println("number is prime " +num);
   }
   else
   {
    System.out.println("number is not prime " +num);
   }

    }
}
//isko krna he
//program for print prime string