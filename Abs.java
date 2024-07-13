//Abstract example_01
abstract class M
{
    abstract void show();
}
class Abs extends M
{
    void show()
    {
        System.out.println("qwertyuiop");
    }
    public static void main(String[] args)
    {
        Abs a = new Abs();
        a.show();
    }
}