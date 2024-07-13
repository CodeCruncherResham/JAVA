//AWT Layout
import java.awt.*;
import java.awt.event.*;

class Awtex4 extends Frame implements ActionListener{
    Label l1,l2,l3;
    TextField t1,t2;
    Button b1,b2;
    Awtex4()
    {
        l1=new Label("Num1");
        t1=new TextField();
        l2=new Label("Num2");
        t2=new TextField();
        b1=new Button ("+");
        b2=new Button ("exit");
        l3=new Label("result");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);

        l1.setBounds(100,70,80,40);
        t1.setBounds(190,70,80,40);
        l2.setBounds(100,120,80,40);
        t2.setBounds(190,120,80,40);
        b1.setBounds(190,170,80,40);
        b2.setBounds(280,170,80,40);
        l3.setBounds(100,210,80,40);
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);
    }
    public static void main(String [] args){
        Awtex4 m = new Awtex4();
        m.setSize(1000,300);
        m.setVisible(true);
    }
        public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int num1=Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int sum=num1+num2;

            l3.setText(sum+"");
        }
        if(e.getSource()==b2)
        {
            System.exit(0);
        }
    }


}
