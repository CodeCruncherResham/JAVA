//AWT 
import java.awt.*;
class Awtcheckgrup extends Frame{
    Checkbox c1,c2;
CheckboxGroup cbg;
    Awtcheckgrup()
    {
        cbg =new CheckboxGroup();
        c1=new Checkbox ("Male",cbg,false);
        c2=new Checkbox ("Female",cbg,false);
        add(c1);
        add(c2);

        GridLayout g = new GridLayout(4,1);
        setLayout(g);
    }
    public static void main(String [] args){
        Awtcheckgrup m = new Awtcheckgrup();
        m.setSize(1000,300);
        m.setVisible(true);
    }
}