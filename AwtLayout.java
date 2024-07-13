//AWT Layout
import java.awt.*;
class AwtLayout extends Frame{
    Label l1,l2;
        TextField t1,t2;
    Button b1,b2;

    AwtLayout()
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
        setLayout(null);
        l1.setBounds(100,70,80,40);
        t1.setBounds(190,70,80,40);
        l2.setBounds(100,120,80,40);
        t2.setBounds(190,120,80,40);
        b1.setBounds(190,170,80,40);
        b2.setBounds(280,170,80,40);

    }
    public static void main(String [] args){
        AwtLayout m = new AwtLayout();
        m.setSize(1000,300);
        m.setVisible(true);
    }
}
