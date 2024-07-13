//constructor&set&get()
class Data1
{
    int a,b;
    Data1(int x,int y)
    {
        a=x;
        b=y;
    }
    int geta()
    {
        return a;
    }
    int getb()
    {
        return b;
    }
    public static void main(String[] args)
    {
        Data1 d = new Data1(3,6);
        {
            System.out.println(d.geta());
            System.out.println(d.getb());

        }
    }
}