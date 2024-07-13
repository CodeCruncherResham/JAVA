//AWT +,-,*,/ program buuton ke click pe
import java.awt.*;
import java.awt.event.*;

class AwtAdd extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2,b3,b4;
    int n1,n2;
    AwtAdd()
    {   
        l1=new Label("Num 1");
        t1=new TextField();
        l2=new Label("Num 2");
        t2=new TextField();

        b1=new Button ("+");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

        setLayout(null);
        l1.setBounds(100,70,80,40);
        t1.setBounds(190,70,80,40);
        l2.setBounds(100,120,80,40);
        t2.setBounds(190,120,80,40);
        b1.setBounds(100,170,80,40);

        b1.addActionListener(this);
    }
    public static void main(String [] args)
    {
        AwtAdd m = new AwtAdd();
        m.setSize(1000,300);
        m.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());

            {
            System.out.println("the given number sum is " +(n1+n2));
            
            }
        }

    }
}
