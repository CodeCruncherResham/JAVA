import java.awt.*;
import java.awt.event.*;

class ExamChoice extends Frame implements ActionListener{
Button b1, b2,b3,b4,b5;
Label l1;
    ExamChoice() {
        l1=new Label("WELCOME");
        b1 = new Button("C");
        b2 = new Button("C++");
        b3 = new Button("Java");

        add(l1);
        add(b1);
        add(b2);
        add(b3);

        setLayout(null);
        l1.setBounds(350,70,280,40);
        b1.setBounds(250, 120, 280, 40);
        b2.setBounds(250, 170, 280, 40);
        b3.setBounds(250, 220, 280, 40);
        Font f = new Font("consolas", Font.BOLD, 20);
        l1.setFont(f);
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    public static void main(String[] args) {
        ExamChoice m = new ExamChoice();
        m.setSize(900, 700);
        m.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            ExamC x = new ExamC();
            x.setSize(1000, 900);
            x.setVisible(true);
        }
        if (e.getSource() == b2) {
            ExamCplus x = new ExamCplus();
            x.setSize(1000, 900);
            x.setVisible(true);
        }
        if (e.getSource() == b3) {
            ExamJava x = new ExamJava();
            x.setSize(1000, 900);
            x.setVisible(true);
        }


    }

}
