import java.awt.*;
import java.awt.event.*;

class AddFact extends Frame implements ActionListener {
    Button b1, b2;

    AddFact() {
        b1 = new Button("sum");
        b2 = new Button("fact");

        add(b1);
        add(b2);

        setLayout(null);
        b1.setBounds(100, 70, 80, 40);
        b2.setBounds(190, 70, 80, 40);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public static void main(String[] args) {
        AddFact m = new AddFact();
        m.setSize(1000, 300);
        m.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            AwtAdd x = new AwtAdd();
            x.setSize(1000, 300);
            x.setVisible(true);
        }
        if (e.getSource() == b2) {
            AwtFactorial x = new AwtFactorial();
            x.setSize(1000, 300);
            x.setVisible(true);
        }
    }
}
