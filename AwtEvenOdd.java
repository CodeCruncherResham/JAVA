//AWT even odd program
import java.awt.*;
import java.awt.event.*;
class AwtEvenOdd extends Frame implements ActionListener
{
    Label l1;
    TextField t1;
    Button b1,b2;
    int n;
    AwtEvenOdd()
    {   
        l1=new Label("Num");
        t1=new TextField();
        b1=new Button ("Even/Odd");
        b2=new Button ("Exit");

        add(l1);
        add(t1);
        add(b1);
        add(b2);

        setLayout(null);
        l1.setBounds(100,70,80,40);
        t1.setBounds(190,70,80,40);
        b1.setBounds(100,120,80,40);
        b2.setBounds(190,120,80,40);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public static void main(String [] args)
    {
        AwtEvenOdd m = new AwtEvenOdd();
        m.setSize(1000,300);
        m.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            n=Integer.parseInt(t1.getText());
            if(n%2==0)
            {
                System.out.println("the given number "+n+" is Even");
            }
            else
            {
            System.out.println("the given number "+n+" is Odd");
  
            }
        }
        if(e.getSource()==b2)
        {
            System.exit(0);
        }

    }
}
