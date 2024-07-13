//AWT 
import java.awt.*;
class AwtEx2 extends Frame{
        Button b1,b2;
        AwtEx2(){
            b1=new Button ("Ok");
            b2=new Button ("cancle");

            add(b1);
            add(b2);
GridLayout g = new GridLayout();
setLayout(g);
        }
    public static void main(String [] args){
        AwtEx2 m = new AwtEx2();
        m.setSize(1000,30);
        m.setVisible(true);
    }
}