import java.awt.*;
import java.awt.event.*;
class CheckInn extends Frame implements ActionListener{
    Label l1,name,address,number,days,room,pay,l2,l3,l4,l5,l6,l7;
    TextField nametext,addresstext,numbertext,daystext;
    Checkbox deluxe,general,fulldeluxe,joint,cash,card;
    CheckboxGroup cbg1,cbg2;
    Button submit;
    CheckInn(){
    Font f = new Font("consolas", Font.BOLD, 20);
       l1=new Label("YOU CLICKED ON   :   CHECK INN");
       add(l1);
       l1.setFont(f);

        name=new Label("Enter Your Name ");
        add(name);
        name.setFont(f);
        nametext=new TextField();
        add(nametext);        
        nametext.setFont(f);

        address=new Label("Enter Your Address ");  
        add(address);      
        address.setFont(f);
        addresstext=new TextField();
        add(addresstext);      
        addresstext.setFont(f);

        number=new Label("Enter Your Number ");  
        add(number);      
        number.setFont(f);
        numbertext=new TextField(); 
        add(numbertext);       
        numbertext.setFont(f);

        days=new Label("Number Of Days ");
        add(days);        
        days.setFont(f);
        daystext=new TextField();
        add(daystext);        
        daystext.setFont(f);

        room=new Label("CHOOSE YOUR ROOM ");
        add(room);
        room.setFont(f);
        cbg1 =new CheckboxGroup();
        deluxe=new Checkbox ("Deluxe",cbg1,false);
        add(deluxe);
        deluxe.setFont(f);
        general=new Checkbox ("General",cbg1,false);
        add(general);
        general.setFont(f);
        fulldeluxe=new Checkbox ("Full Deluxe",cbg1,false);
        add(fulldeluxe);
        fulldeluxe.setFont(f);
        joint=new Checkbox ("Joint",cbg1,false);
        add(joint);
        joint.setFont(f);

        pay=new Label("CHOOSE PAYMENT METHOD ");
        add(pay);
        pay.setFont(f);
        cbg2 =new CheckboxGroup();
        cash=new Checkbox ("By cash",cbg2,false);
        add(cash);
        cash.setFont(f);
        card=new Checkbox ("By credit/debit card",cbg2,false);
        add(card);
        card.setFont(f);

        submit=new Button("Submit");
        add(submit);
        submit.setFont(f);
         submit.addActionListener(this);

        //add for show result
        l2=new Label("Name"+"");
        add(l2);
        l2.setFont(f);
        l3=new Label("Adress"+"");
        add(l3);
        l3.setFont(f);
        l4=new Label("Number"+"");
        add(l4);
        l4.setFont(f);
        l5=new Label("Days"+"");
        add(l5);
        l5.setFont(f);
        l6=new Label("Room"+"");
        add(l6);
        l6.setFont(f);
        l7=new Label("Payment"+"");
        add(l7);
        l7.setFont(f);

        setLayout(null);
        l1.setBounds(200,30,380,40);
        name.setBounds(100,80,280,40);
        nametext.setBounds(380,80,280,40);
        address.setBounds(100,130,280,40);
        addresstext.setBounds(380,130,280,40);
        number.setBounds(100,180,280,40);
        numbertext.setBounds(380,180,280,40);        
        days.setBounds(100,230,280,40);
        daystext.setBounds(380,230,280,40);
        room.setBounds(100,280,280,40);
        deluxe.setBounds(380,280,280,40);
        general.setBounds(680,280,280,40);
        fulldeluxe.setBounds(380,330,280,40);
        joint.setBounds(680,330,280,40);
        pay.setBounds(100,380,300,40);
        cash.setBounds(400,380,280,40);
        card.setBounds(690,380,280,40);
        submit.setBounds(500,430,80,40);
        l2.setBounds(100,480,380,40);
        l3.setBounds(100,530,380,40);
        l4.setBounds(100,580,380,40);
        l5.setBounds(100,630,380,40);
        l6.setBounds(100,680,380,40);
        l7.setBounds(100,730,380,40);


}
        public static void main(String[] args) {
        CheckInn m = new CheckInn();
        m.setSize(900, 500);
        m.setVisible(true);
    }
            public void actionPerformed (ActionEvent e)
    {
        String SelectedRoom="";
                    if(deluxe.getState()){
                SelectedRoom=deluxe.getLabel();
            }
            if(general.getState()){
                SelectedRoom=general.getLabel();
            }
            if(fulldeluxe.getState()){
                SelectedRoom=fulldeluxe.getLabel();
            }
            if(joint.getState()){
                SelectedRoom=joint.getLabel();
            }
            String SelectedPay="";
            if(cash.getState()){
                SelectedPay=cash.getLabel();
            }

            if(card.getState()){
                SelectedPay=card.getLabel();
            }

        if(e.getSource()==submit)
        {
            int num1 = Integer.parseInt(numbertext.getText());
            int num2 = Integer.parseInt(daystext.getText());

            l2.setText(nametext.getText());
            l3.setText(addresstext.getText());
            l4.setText(Integer.toString(num1));
            l5.setText(Integer.toString(num2));
            l6.setText(SelectedRoom);
            l7.setText(SelectedPay);
        }   
    }


}