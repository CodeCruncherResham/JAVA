//AWT Tic Toc Toe game program
import java.awt.*;
import java.awt.event.*;
class AwticToc extends Frame implements ActionListener
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
     Label outcomeLabel;
    int n=1;
    AwticToc()
    {   
        b1=new Button ();
        b2=new Button ();
        b3=new Button ();
        b4=new Button ();
        b5=new Button ();
        b6=new Button ();
        b7=new Button ();
        b8=new Button ();
        b9=new Button ();
        outcomeLabel = new Label("");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
 add(outcomeLabel);

        setLayout(null);
        b1.setBounds(100,70,80,40);
        b2.setBounds(190,70,80,40);
        b3.setBounds(280,70,80,40);
        b4.setBounds(100,120,80,40);                
        b5.setBounds(190,120,80,40);
        b6.setBounds(280,120,80,40);
        b7.setBounds(100,170,80,40);
        b8.setBounds(190,170,80,40);
        b9.setBounds(280,170,80,40);
//   outcomeLabel.setBounds(100, 220, 80, 40);
outcomeLabel.setBounds(100, 220, 260, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

    }
    public static void main(String [] args)
    {
        AwticToc m = new AwticToc();
        m.setSize(1000,300);
        m.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(b1.getLabel().length()==0){
            if(n%2==1)
            {
                b1.setLabel("*");
            }
            else
            {
                b1.setLabel("0");
            }
            n++;
            }
        }
        if(e.getSource()==b2)
        {
            if(b2.getLabel().length()==0){
            if(n%2==1)
            {
                b2.setLabel("*");
            }
            else
            {
                b2.setLabel("0");
            }
            n++;
                        }
        }
        if(e.getSource()==b3)
        {
            if(b3.getLabel().length()==0){
            if(n%2==1)
            {
                b3.setLabel("*");
            }
            else
            {
                b3.setLabel("0");
            }
            n++;
            }
        }
        if(e.getSource()==b4)
        {
            if(b4.getLabel().length()==0)
            {
            if(n%2==1)
            {
                b4.setLabel("*");
            }
            else
            {
                b4.setLabel("0");
            }
            n++;
            }
        }
        if(e.getSource()==b5)
        {
            if(b5.getLabel().length()==0)
            {
            if(n%2==1)
            {
                b5.setLabel("*");
            }
            else
            {
                b5.setLabel("0");
            }
            n++;
            }
        }
        if(e.getSource()==b6)
        {    
            if(b6.getLabel().length()==0)
            {
            if(n%2==1)
            {
                b6.setLabel("*");
            }
            else
            {
                b6.setLabel("0");
            }
            n++;
            }
        }
        if(e.getSource()==b7)
        {
            if(b7.getLabel().length()==0)
            {
            if(n%2==1)
            {
                b7.setLabel("*");
            }
            else
            {
                b7.setLabel("0");
            }
            n++;
                        }
        }
        if(e.getSource()==b8)
        {
            if(b8.getLabel().length()==0){

            if(n%2==1)
            {
                b8.setLabel("*");
            }
            else
            {
                b8.setLabel("0");
            }
            n++;
            }
        }
        if(e.getSource()==b9)
        {
            if(b9.getLabel().length()==0){
            if(n%2==1)
            {
                b9.setLabel("*");
            }
            else
            {
                b9.setLabel("0");
            }
            n++;
            }
        }
                //code for find winner
        
        String a1=b1.getLabel();
        String a2=b2.getLabel();
        String a3=b3.getLabel();
        String a4=b4.getLabel();
        String a5=b5.getLabel();
        String a6=b6.getLabel();
        String a7=b7.getLabel();
        String a8=b8.getLabel();
        String a9=b9.getLabel();


if(a1.equals("*")&&a2.equals("*")&&a3.equals("*")||a4.equals("*")&&a5.equals("*")&&a6.equals("*")||a7.equals("*")&&a8.equals("*")&&a9.equals("*")||a1.equals("*")&&a4.equals("*")&&a7.equals("*")||a2.equals("*")&&a5.equals("*")&&a8.equals("*")||a3.equals("*")&&a6.equals("*")&&a9.equals("*")||a3.equals("*")&&a5.equals("*")&&a7.equals("*")||a1.equals("*")&&a5.equals("*")&&a9.equals("*"))
        {
          outcomeLabel.setText("Player 1 is winner");
                        restart();
        }
                if(a1.equals("0")&&a2.equals("0")&&a3.equals("0")||a4.equals("0")&&a5.equals("0")&&a6.equals("0")||a7.equals("0")&&a8.equals("0")&&a9.equals("0")||a1.equals("0")&&a4.equals("0")&&a7.equals("0")||a2.equals("0")&&a5.equals("0")&&a8.equals("0")||a3.equals("0")&&a6.equals("0")&&a9.equals("0")||a3.equals("0")&&a5.equals("0")&&a7.equals("0")||a1.equals("0")&&a5.equals("0")&&a9.equals("0"))
        {
            outcomeLabel.setText("Player 2 is winner");
                        restart();

        }
        if (n == 10) {
 outcomeLabel.setText("It's a draw!");
           restart();
        }
            }

void restart() {
    b1.setLabel("");
    b2.setLabel("");
    b3.setLabel("");
    b4.setLabel("");
    b5.setLabel("");
    b6.setLabel("");
    b7.setLabel("");
    b8.setLabel("");
    b9.setLabel("");

    n = 1;
}

void visible() {
b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
            n = 1;
}

}
