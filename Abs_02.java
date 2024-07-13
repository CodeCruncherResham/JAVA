//Abstract example_02
abstract class M
{
    protected int a,b;
    public void set(int x,int y)
    {
        a=x;
        b=y;
    }
    abstract void cal();
}
class Abs_02 extends M
{
    void cal()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        Abs_02 a = new Abs_02();
        a.set(4,6);
        a.cal();
    }
}