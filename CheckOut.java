import java.awt.*;
import java.awt.event.*;
class CheckOut extends Frame implements ActionListener{
    Label room;
    TextField t1;
    Button checkout;
    CheckOut(){
     room=new Label(" ENTER THE ROOM NO. ");
     t1=new TextField();
      checkout=new Button("CHECK OUT");
     add(room);
     add(t1);
     add(checkout);
     room.setBounds(100,50,180,40);
     t1.setBounds(290,50,40,40);
      checkout.setBounds(200,100,80,40);
      checkout.addActionListener(this);
    }
    public static void main(String[] args){
        CheckOut co = new CheckOut();
        co.setSize(1000,800);
        co.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==checkout){
            System.out.println("rf");
        }
    }
}