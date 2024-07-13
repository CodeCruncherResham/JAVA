//AWT +,-,*,/ program buuton ke click pe
import java.awt.*;
import java.awt.event.*;
class AwtPractice extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2,b3,b4;
    int n1,n2;
    AwtPractice()
    {   
        l1=new Label("Num 1");
        t1=new TextField();
        l2=new Label("Num 2");
        t2=new TextField();

        b1=new Button ("+");
        b2=new Button ("-");
        b3=new Button ("*");
        b4=new Button ("/");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(null);
        l1.setBounds(100,70,80,40);
        t1.setBounds(190,70,80,40);
        l2.setBounds(100,120,80,40);
        t2.setBounds(190,120,80,40);
        b1.setBounds(100,170,80,40);
        b2.setBounds(190,170,80,40);
        b3.setBounds(100,220,80,40);
        b4.setBounds(190,220,80,40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }
    public static void main(String [] args)
    {
        AwtPractice m = new AwtPractice();
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
        if(e.getSource()==b2)
        {
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());

            {
            System.out.println("the given number subtraction is " +(n1-n2));
            }
        }
        if(e.getSource()==b3)
        {
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());

            {
            System.out.println("the given number multiplication is "+(n1*n2));
            }
        }
        if(e.getSource()==b4)
        {
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            {
            System.out.println("the given number division is " +(n1/n2));
  
            }
        }


    }
}
