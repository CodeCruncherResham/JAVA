import java.util.Scanner;
class FirstDoWhile{
    public static void main(String [] args){
        int a,b,c,d;
        char ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1 for Add ,2 for Mul, 3 for Sub");
             d =  sc.nextInt();
             if(d>3 || d<1)
             {
                System.out.println("please enter number between 1 to 3");
             }

             System.out.println("enter two num");
             a = sc.nextInt();
             b = sc.nextInt();
             if(d==1){
                 System.out.println("Additon is " +(a+b));
             }
                          if(d==2){
                 System.out.println("Multiplication is " +(a*b));
             }
                          if(d==3){
                 System.out.println("Subtraction is " +(a-b));
             }
            System.out.println("y to continue and n to exit");
            ch=sc.next().charAt(0);
        }
        while(ch != 'n');
    }
}