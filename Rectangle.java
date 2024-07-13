// //overload constructor

class Rectangle
{
    int length,breadth;
    //having no parameter
    Rectangle()
    {
        length=0;
        breadth=0;
    }
//having one number as parameter
        Rectangle(int side)
    {
        length=side;
        breadth=side;
    }
    //having two number as parameter
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int getlength()
    {
        return length;
    }
    int getbreadth()
    {
        return breadth;
    }
public int getArea() {
        return length * breadth;
    }
    public static void main(String[] args)
    {
        Rectangle none = new Rectangle();
        Rectangle one = new Rectangle(2);
        Rectangle two = new Rectangle(4,6);
         System.out.println(none.getArea());
        System.out.println(one.getArea());
        System.out.println(two.getArea());


    }

}