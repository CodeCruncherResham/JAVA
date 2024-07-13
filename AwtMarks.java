import java.awt.*;
import java.awt.event.*;
class AwtMarks extends Frame implements ActionListener {
    Label l1, l2, l3;
    Choice ch1, ch2, ch3;
    Button b1;
int sum=0,a,b,c;
    AwtMarks() {
        l1 = new Label("Marks1");
        ch1 = new Choice();
        l2 = new Label("Marks2");
        ch2 = new Choice();
        l3 = new Label("Marks3");
        ch3 = new Choice();
        b1=new Button("Sum");

        add(l1);
        add(ch1);
        for(int i=1;i<=100;i++){
        ch1.add(i+"");
    }

        add(l2);
        add(ch2);
        for(int i=1;i<=100;i++){
        ch2.add(i+"");
    }

        add(l3);
        add(ch3);
        for(int i=1;i<=100;i++){
        ch3.add(i+"");
    }
    add(b1);

        b1.addActionListener(this);
        setLayout(null); // Setting layout to null to use setBounds
        l1.setBounds(100, 70, 80, 40);
        ch1.setBounds(190, 80, 80, 40);
        l2.setBounds(100, 120, 80, 40);
        ch2.setBounds(190, 130, 80, 40);
        l3.setBounds(100, 170, 80, 40);
        ch3.setBounds(190, 180, 80, 40);
        b1.setBounds(100,220,80,40);

    }

    public static void main(String[] args) {
        AwtMarks m = new AwtMarks();
        m.setSize(400, 300);
        m.setVisible(true);
    }
            public void actionPerformed (ActionEvent e){
            if(ch1.getSelectedItem()){
                // System.out.println(ch1.getLabel());
                sum=sum+Integer.parseInt(ch1.getLabel());
            }
            if(ch2.getSelectedItem()){
                // System.out.println(ch2.getLabel());
                sum=sum+Integer.parseInt(ch2.getLabel());
            }
            if(ch3.getSelectedItem()){
                // System.out.println(ch3.getLabel());
                sum=sum+Integer.parseInt(ch3.getLabel());
            }

            // a=Integer.parseInt(ch1.getSelectedItem());
            // b=Integer.parseInt(ch2.getSelectedItem());
            // c=Integer.parseInt(ch3.getSelectedItem());
            // sum=(a+b+c);
            if(e.getSource()==b1)
            {
                System.out.println("sum is "+sum);
                sum=0; 
            } 

            }

}
//isko complete krna he
