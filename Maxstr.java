import java.util.*;
class Maxstr{
    public static void main(String[] args){
        String[][] x = new String[3][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  string");

        for(int i=0;i<3;i++){
            for(int j =0;j<2;j++){
        x[i][j]=sc.next();
            }
        }
        //first three rows are
                for(int i=0;i<3;i++){
            for(int j =0;j<2;j++){
        System.out.print(x[i][j] +"  ");
            }
        System.out.println();
        }

    }
}
//isko krna he