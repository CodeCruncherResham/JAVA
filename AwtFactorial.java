//AWT +,-,*,/ program buuton ke click pe
import java.awt.*;
import java.awt.event.*;
class AwtFactorial extends Frame implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button b1;
    int n1;
    AwtFactorial()
    {   
        l1=new Label("Num 1");
        t1 = new TextField();

        b1=new Button ("factorial");

        add(l1);
        add(t1);

        add(b1);

        setLayout(null);
        l1.setBounds(100,70,80,40);
        t1.setBounds(190,70,80,40);
        b1.setBounds(100,120,80,40);

        b1.addActionListener(this);
    }

    public static void main(String [] args)
    {
        AwtFactorial m = new AwtFactorial();
        m.setSize(1000,300);
        m.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==b1)
        {
  int i, num,fact = 1;
              num=Integer.parseInt(t1.getText());

  for(i=1;i<=num;i++){
   fact = fact * i;
  }
   System.out.println("factorial of " +num+  " = " +fact);
        }

    }
}
