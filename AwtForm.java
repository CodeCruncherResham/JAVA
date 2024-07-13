//AWT registration form
import java.awt.*;
class AwtForm extends Frame{
    Label l1,l2,l3,l4,l5;
    TextField t1;
    CheckboxGroup cbg;
    Checkbox cg1,cg2,c1,c2,c3,c4;
    Choice ch1,ch2;

    Button b1,b2;

    AwtForm()
    {
        l1=new Label("Roll No");
        t1=new TextField();
        l2=new Label("Gender");
        cbg =new CheckboxGroup();
        cg1=new Checkbox ("Male",cbg,false);
        cg2=new Checkbox ("Female",cbg,false);
        l3=new Label("Course");
        c1=new Checkbox ("C");
        c2=new Checkbox ("C++");
        c3=new Checkbox ("Java");
        c4=new Checkbox ("D.Net");
        l4=new Label("Branch");
        ch1=new Choice ();
        l5=new Label("Sem");
        ch2=new Choice();
        b1=new Button ("save");
        b2=new Button ("exit");
        add(l1);
        add(t1);
        add(l2);
        add(cg1);
        add(cg2);
        add(l3);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(l4);
        add(ch1);
        ch1.add("CSE");
        ch1.add("IT");
        ch1.add("ME");
        add(l5);
        add(ch2);
        for(int i=1;i<=100;i++){
        ch2.add(i+"");
    }

        add(b1);
        add(b2);
        setLayout(null);
        l1.setBounds(100,70,80,40);
        t1.setBounds(190,70,80,40);
        l2.setBounds(100,120,80,40);
        cg1.setBounds(190,120,80,40);
        cg2.setBounds(270,120,80,40);
        l3.setBounds(100,160,80,40);
        c1.setBounds(190,160,80,40);
        c2.setBounds(270,160,80,40);
        c3.setBounds(350,160,80,40);
        c4.setBounds(430,160,80,40);
        l4.setBounds(100,210,80,40);
        ch1.setBounds(190,210,80,40);
        l5.setBounds(100,260,80,40);
        ch2.setBounds(190,260,80,40);
        b1.setBounds(100,300,80,40);
        b2.setBounds(190,300,80,40);
    }
    public static void main(String [] args){
        AwtForm m = new AwtForm();
        m.setSize(1000,300);
        m.setVisible(true);
    }
}
