//checkbox se value nikalna
//radio ke liye bhi yhi use hota he
import java.awt.*;
import java.awt.event.*;
class Check_Value extends Frame implements ActionListener{
    Checkbox ch1,ch2,ch3,ch4,ch5;
    int sum=0;
    Button b1;
    Check_Value(){

        ch1=new Checkbox("1");
        ch2=new Checkbox("2");
        ch3=new Checkbox("3");
        ch4=new Checkbox("4");
        ch5=new Checkbox("5");
        b1=new Button("sum");
        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);
        add(ch5);
        add(b1);
        b1.addActionListener(this);

        setLayout(null);
        ch1.setBounds(50,50,100,40); 
        ch2.setBounds(50,90,100,40);
        ch3.setBounds(50,130,100,40);
        ch4.setBounds(50,170,100,40);
        ch5.setBounds(50,210,100,40);
        b1.setBounds(50,250,100,40);

    }
    public static void main(String [] args){
        Check_Value m = new Check_Value();
        m.setSize(1000,300);
        m.setVisible(true);
    }
        public void actionPerformed (ActionEvent e){
            if(ch1.getState()){
                System.out.println(ch1.getLabel());
                sum=sum+Integer.parseInt(ch1.getLabel());
            }
            if(ch2.getState()){
                System.out.println(ch2.getLabel());
                sum=sum+Integer.parseInt(ch2.getLabel());
            }
            if(ch3.getState()){
                System.out.println(ch3.getLabel());
                sum=sum+Integer.parseInt(ch3.getLabel());
            }
            if(ch4.getState()){
                System.out.println(ch4.getLabel());
                sum=sum+Integer.parseInt(ch4.getLabel());
            }
            if(ch5.getState()){
                System.out.println(ch5.getLabel());
                sum=sum+Integer.parseInt(ch5.getLabel());
            }


            if(e.getSource()==b1)
            {
                System.out.println("sum is "+sum);
                sum=0; 
            } 

    }
}