import java.awt.*;
import java.awt.event.*;

class ExamMngSys extends Frame implements ActionListener {

    String[] q = {"What is your first programming language", "20+30", "20-30", "20*30", "pm of india", "2+4=?",
    "3*6=?", "gateway of india is located", "brain of computer", "how many vowels are there"};
    String[] op1 = {"C", "-1", "0", "90", "Narendra modi", "8", "15", "delhi", "monitor", "3"};
    String[] op2 = {"C++", "50", "-9", "50", "Amit Shah", "6", "18", "uttarkand", "keyboard", "5"};
    String[] op3 = {"Java", "-50", "-10", "54", "piyush goyal", "7", "21", "mumbai", "RAM", "7"};
    String[] op4 = {"Python", "46", "10", "60", "s.jaishankar", "5", "24", "chhattisgarh", "CPU", "9"};
    String[] ansBtn = {"1", "2", "3", "4", "1", "2", "2", "3", "4", "2"};
    int currentQuestionIndex = 0;
    Label l1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, ansButton, next, previous, finish;
    Checkbox c1, c2, c3, c4;
    CheckboxGroup cbg;
    int x = 0; // Reset x for each question
   int[] count = {0,0,0,0,0,0,0,0,0,0};

    ExamMngSys() {
        l1 = new Label();
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("10");
        ansButton = new Button("ans");
        next = new Button("next");
        previous = new Button("previous");
        finish = new Button("score");
        cbg = new CheckboxGroup();
        c1 = new Checkbox("", cbg, false);
        c2 = new Checkbox("", cbg, false);
        c3 = new Checkbox("", cbg, false);
        c4 = new Checkbox("", cbg, false);

        setLayout(null);
        b1.setBounds(50, 60, 80, 40);
        b2.setBounds(130, 60, 80, 40);
        b3.setBounds(210, 60, 80, 40);
        b4.setBounds(290, 60, 80, 40);
        b5.setBounds(370, 60, 80, 40);
        b6.setBounds(440, 60, 80, 40);
        b7.setBounds(520, 60, 80, 40);
        b8.setBounds(600, 60, 80, 40);
        b9.setBounds(680, 60, 80, 40);
        b10.setBounds(760, 60, 80, 40);
        ansButton.setBounds(850, 60, 80, 40);
        next.setBounds(930, 60, 80, 40);
        previous.setBounds(1010, 60, 80, 40);
        finish.setBounds(1090, 60, 80, 40);
        l1.setBounds(50, 120, 250, 40);
        c1.setBounds(50, 150, 80, 40);
        c2.setBounds(130, 150, 80, 40);
        c3.setBounds(210, 150, 80, 40);
        c4.setBounds(290, 150, 80, 40);

        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(ansButton);
        add(next);
        add(previous);
        add(finish);
        add(c1);
        add(c2);
        add(c3);
        add(c4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        ansButton.addActionListener(this);
        next.addActionListener(this);
        previous.addActionListener(this);
        finish.addActionListener(this);

        setSize(1200, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExamMngSys m = new ExamMngSys();
    }


    void displayQuestion(int index) {
        l1.setText(q[index]);
        c1.setLabel(op1[index]);
        c2.setLabel(op2[index]);
        c3.setLabel(op3[index]);
        c4.setLabel(op4[index]);
    }

    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
    l1.setText(q[0]);
    c1.setLabel(op1[0]);
    c2.setLabel(op2[0]);
    c3.setLabel(op3[0]);
    c4.setLabel(op4[0]);
    }
    else if (e.getSource() == b2)
    {
    l1.setText(q[1]);
    c1.setLabel(op1[1]);
    c2.setLabel(op2[1]);
    c3.setLabel(op3[1]);
    c4.setLabel(op4[1]);
    }
    else if (e.getSource() == b3) {
    l1.setText(q[2]);
    c1.setLabel(op1[2]);
    c2.setLabel(op2[2]);
    c3.setLabel(op3[2]);
    c4.setLabel(op4[2]);
    } 
    else if (e.getSource() == b4) {
    l1.setText(q[3]);
    c1.setLabel(op1[3]);
    c2.setLabel(op2[3]);
    c3.setLabel(op3[3]);
    c4.setLabel(op4[3]);
    }
    else if (e.getSource() == b5) {
    l1.setText(q[4]);
    c1.setLabel(op1[4]);
    c2.setLabel(op2[4]);
    c3.setLabel(op3[4]);
    c4.setLabel(op4[4]);
}
    else if (e.getSource() == b6) {
    l1.setText(q[5]);
    c1.setLabel(op1[5]);
    c2.setLabel(op2[5]);
    c3.setLabel(op3[5]);
    c4.setLabel(op4[5]);
    }
     else if (e.getSource() == b7) {
    l1.setText(q[6]);
    c1.setLabel(op1[6]);
    c2.setLabel(op2[6]);
    c3.setLabel(op3[6]);
    c4.setLabel(op4[6]);
    } 
    else if (e.getSource() == b8){
    l1.setText(q[7]);
    c1.setLabel(op1[7]);
    c2.setLabel(op2[7]);
    c3.setLabel(op3[7]);
    c4.setLabel(op4[7]);
    } 
    else if (e.getSource() == b9) {
    l1.setText(q[8]);
    c1.setLabel(op1[8]);
    c2.setLabel(op2[8]);
    c3.setLabel(op3[8]);
    c4.setLabel(op4[8]);
    } 
    else if (e.getSource() == b10) {
    l1.setText(q[9]);
    c1.setLabel(op1[9]);
    c2.setLabel(op2[9]);
    c3.setLabel(op3[9]);
    c4.setLabel(op4[9]);
    }

    if (e.getSource() == next) {
            currentQuestionIndex++;
            if (currentQuestionIndex >= q.length) {
                currentQuestionIndex = 0;
            }
            displayQuestion(currentQuestionIndex);
        } else if (e.getSource() == previous) {
            currentQuestionIndex--;
            if (currentQuestionIndex < 0) {
                currentQuestionIndex = q.length - 1;
            }
            displayQuestion(currentQuestionIndex);
        } 
        else if (e.getSource() == ansButton) {
             
            if (c1.getState()) {
                x = 1;
            }
            if (c2.getState()) {
                x = 2;
            }
            if (c3.getState()) {
                x = 3;
            }
            if (c4.getState()) {
                x = 4;
            }
            if (x == Integer.parseInt(ansBtn[currentQuestionIndex])) {
                l1.setText("Right");
                count[currentQuestionIndex]=1;

            } else {
                l1.setText("wrong");
                count[currentQuestionIndex]=0;

            }
        }
         else if (e.getSource() == finish) {
                int s=0;
            System.out.println("Your score is: " + count + "/" + q.length);
            for(int i=0;i<count.length;i++){
                s=s+count[i];
            }
            System.out.println("sum is :"+s);
        }

    }
}

