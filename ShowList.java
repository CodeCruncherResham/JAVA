import java.awt.*;
import java.awt.event.*;
class ShowList extends Frame{
    Label name,room;
    TextField nametext,t1;
    ShowList(){
         name=new Label("Name ");
         t1=new TextField();
         room=new Label("ROOM NO. ");
         numbertext=new TextField(); 

        add(name);
        add(t1);
        add(room);
        add(numbertext); 

setLayout(null);
name.setBounds(150,70,80,40);
numbertext(150,120,150,150);

room.setBounds(250,70,80,40);
t1.setBounds(250,120,150,150);


    }
        public static void main(String[] args){
            ShowList al=new ShowList();
            al.setSize(1000,800);
            al.setVisible(true);
        }
}