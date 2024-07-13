import java.awt.*;
import java.awt.event.*;

class Welcome extends Frame implements ActionListener{
    Button b1, b2,b3,b4,b5;
Label l1;
    Welcome() {
        l1=new Label("WELCOME");
        b1 = new Button("1.CHECK INN");
        b2 = new Button("2.SHOW GUEST LIST");
        b3 = new Button("3.CHECK OUT");
        b4 = new Button("4.GET INFO OF ANY GUEST");
        b5 = new Button("5.EXIT");

        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        setLayout(null);
        l1.setBounds(350,70,280,40);
        b1.setBounds(250, 120, 280, 40);
        b2.setBounds(250, 170, 280, 40);
        b3.setBounds(250, 220, 280, 40);
        b4.setBounds(250, 270, 280, 40);
        b5.setBounds(250, 320, 280, 40);
        Font f = new Font("consolas", Font.BOLD, 20);
        l1.setFont(f);
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    public static void main(String[] args) {
        Welcome m = new Welcome();
        m.setSize(900, 700);
        m.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            CheckInn x = new CheckInn();
            x.setSize(1000, 900);
            x.setVisible(true);
        }
        // if (e.getSource() == b2) {
        //     ShowList x = new ShowList();
        //     x.setSize(1000, 900);
        //     x.setVisible(true);
        // }
        //         if (e.getSource() == b3) {
        //     CheckOut x = new CheckOut();
        //     x.setSize(1000, 900);
        //     x.setVisible(true);
        // }
        // if (e.getSource() == b4) {
        //     GetInfoGuest x = new GetInfoGuest();
        //     x.setSize(1000, 900);
        //     x.setVisible(true);
        // }
        // if (e.getSource() == b5) {
        //     Exit x = new Exit();
        //     x.setSize(1000, 900);
        //     x.setVisible(true);
        // }
    }

}
