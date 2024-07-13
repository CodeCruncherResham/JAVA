

import java.awt.*;
import java.awt.event.*;

class ExamLog extends Frame implements ActionListener {
    Label n, p;
    TextField name, pass;
    Button b1, b2;
    int enterpass;

    ExamLog() {
        n = new Label("UserName:", Label.CENTER);
        p = new Label("Password:", Label.CENTER);
        name = new TextField();
        pass = new TextField();
        b1 = new Button("Submit");
        b2 = new Button("Cancel");
        add(n);
        add(name);
        add(p);
        add(pass);
        add(b1);
        add(b2);
        setLayout(null);
        n.setBounds(70, 80, 90, 60);
        p.setBounds(70, 120, 90, 60);
        name.setBounds(200, 100, 90, 20);
        pass.setBounds(200, 140, 90, 20);
        b1.setBounds(100, 260, 70, 40);
        b2.setBounds(180, 260, 70, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public static void main(String[] args) {
        ExamLog el = new ExamLog();
        el.setVisible(true);
        el.setSize(400, 400);
        el.setTitle("my login window");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String enteredPassword = pass.getText();
            if ("pass".equals(enteredPassword)) {
                ExamChoice x = new ExamChoice();
                x.setSize(1000, 900);
                x.setVisible(true);
            } else {
System.out.println("please enter a valid password");
            }
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }
}
