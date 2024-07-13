import java.util.*;
class M
{

    private String name;
    private double actualprice;
    private double discount;
    private double totalprice;

        public void setrnm(String n,double m,double d,double s)
    {
        name= n;
        actualprice=m;
        discount=d;
        totalprice=s;
    }
        public String getname()
    {
        return name;
    }
            public double getactualprice()
    {
        return actualprice;
    }
            public double getdiscount()
    {
        return discount;
    }

        public double gettotalprice()
    {
        return totalprice;
    }
}
class Product{

        public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
                M s1 = new M();
                M s2 = new M();

        System.out.println("Enter name and actualprice and discount and totalprice of Student1 : ");
        s1.setrnm(sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter name and actualprice and discount and totalprice of Student2 : ");
        s1.setrnm(sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

        if(s1.getactualprice()>s2.getactualprice())
{
    System.out.println("name is " +s1.getname());
        System.out.println("actual price  no is "+s1.getactualprice());
    System.out.println("discount is "+s1.getdiscount());
    System.out.println("total price  no is "+s1.gettotalprice());
}
else
{
    System.out.println("name is " +s2.getname());
    System.out.println("actual price  no is "+s1.getactualprice());
    System.out.println("discount is "+s1.getdiscount());
    System.out.println("roll no is "+s2.gettotalprice());
}


}
}
