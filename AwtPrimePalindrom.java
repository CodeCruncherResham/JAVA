//AWT prime palindrom program
import java.awt.*;
import java.awt.event.*;
class AwtPrimePalindrom extends Frame implements ActionListener
{
    Label l1;
    TextField t1;
    Button b1,b2;
    int n,rev=0,ele,rem;
    AwtPrimePalindrom()
    {   
        l1=new Label("Num");
        t1=new TextField();
        b1=new Button ("Prime");
        b2=new Button ("Palindrom");

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
        AwtPrimePalindrom m = new AwtPrimePalindrom();
        m.setSize(1000,300);
        m.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            n=Integer.parseInt(t1.getText());
            if(n % 2 == 0)
        {
         System.out.println("number is prime " +n);
        }
        else
        {
        System.out.println("number is not prime " +n);
        }
        }
        if(e.getSource()==b2)
        {
          n=Integer.parseInt(t1.getText());
          ele = n;
        while(n != 0)
        {
        rem = n%10;
        rev = rev * 10 + rem;
        n = n/10;
        }
        if(ele == rev)
        {
        System.out.println( ele+ " is palindrom number");
        }
        else
        {
          System.out.println( ele+ " is not palindrom number");
        }
        }

    }
}
