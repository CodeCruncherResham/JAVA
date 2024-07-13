//AWT CHECKBOX
import java.awt.*;
class AwtCheckbox extends Frame{
    Checkbox c1,c2,c3,c4;
    AwtCheckbox()
    {
        c1=new Checkbox ("C");
        c2=new Checkbox ("C++");
        c3=new Checkbox ("Java");
        c4=new Checkbox ("D.Net");

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        GridLayout g = new GridLayout(4,1);
        setLayout(g);
    }
    public static void main(String [] args){
        AwtCheckbox m = new AwtCheckbox();
        m.setSize(1000,300);
        m.setVisible(true);
    }
}