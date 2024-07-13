//AWT 
import java.awt.*;
class AwtChoice extends Frame{
    Label l1,l2;
    Choice c1,c2;
    AwtChoice()
    {
        l1=new Label("Branch");
        c1=new Choice ();
        l2=new Label("Sem");
        c2=new Choice();
        add(l1);
        add(c1);
        c1.add("CSE");
        c1.add("IT");
        c1.add("ME");
        add(l2);
        add(c2);
        for(int i=1;i<=100;i++){
        c2.add(i+"");
    }
        GridLayout g = new GridLayout(4,1);
        setLayout(g);
    }
    public static void main(String [] args){
        AwtChoice m = new AwtChoice();
        m.setSize(1000,300);
        m.setVisible(true);
    }
}
