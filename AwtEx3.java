//AWT 
import java.awt.*;
class AwtEx3 extends Frame{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    AwtEx3()
    {
        l1=new Label("Num1");
        t1=new TextField();
        l2=new Label("Num2");
        t2=new TextField();
        b1=new Button ("+");
        b2=new Button ("-");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        GridLayout g = new GridLayout(3,2);
        setLayout(g);
    }
    public static void main(String [] args){
        AwtEx3 m = new AwtEx3();
        m.setSize(1000,300);
        m.setVisible(true);
    }
}