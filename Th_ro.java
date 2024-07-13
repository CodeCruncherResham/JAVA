import java.util.*;
    // throw new Exception();
class Th_ro{
    public void show(){
        throw new ArithmeticException();
    }
    public static void main(String [] args){
        Th_ro x=new Th_ro();
        x.show();
    }
}
//isko krna he