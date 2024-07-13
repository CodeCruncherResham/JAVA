//overload constructor

class Overload
{
    Overload()
    {
        System.out.println("Default Constructor");
    }
        Overload(int a)
    {
        System.out.println("One Argument");
    }
        Overload(int b,int c)
    {
        System.out.println("Two Argument");
    }
            Overload(float a)
    {
        System.out.println("One Argument but data type different");
    }
    public static void main(String[] args)
    {
        Overload o1 = new Overload();
        Overload o2 = new Overload(2);
        Overload o3 = new Overload(4,6);
        Overload o4 = new Overload(3.5f);

    }

}